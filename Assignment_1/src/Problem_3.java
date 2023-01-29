public class Problem_3 {

    /*
        a program that prints ‘Hello World’ to the screen
     */

    public static void main(String[] args) {
        print_multi_table(12);
    }

    public static void print_multi_table(int n) {
        // print title
        System.out.print("\t");
        for (int k = 1; k <= n-1; k ++) {
            System.out.print(k + "\t");
        }
        System.out.println(n);

        // print result
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
            for (int j = 1; j <= n-1; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println(i * n);
        }
    }
}
