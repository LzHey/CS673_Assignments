public class Problem_4 {

    /*
        a function that tests whether a string is a palindrome
     */

    public static void main(String[] args) {
        test_palindrome("");
        test_palindrome(null);
        test_palindrome("A");
        test_palindrome("ababa");
        test_palindrome("abcCBA");
        test_palindrome(" spa C E E C aps ");
    }

    public static void test_palindrome(String str) {
        // Avoid invalid data
        if (str == null || str.length() == 0) {
            System.out.println("This is not a palindrome");
            return;
        }

        int n = str.length();
        char[] arr = str.toCharArray();
        for (int i  = 0; i < n; i++) {
            if (arr[i] != arr[n-i-1]) {
                System.out.println("\"" + str + "\" is not a palindrome");
                return;
            }
        }
        System.out.println("\"" + str + "\" is a palindrome");
    }
}
