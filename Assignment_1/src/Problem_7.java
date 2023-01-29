public class Problem_7 {

    /*
        a function that determines if a given year is a leap year
     */

    public static void main(String[] args) {
        test_leap_year(2020);
        test_leap_year(2021);
        test_leap_year(2022);
        test_leap_year(2023);
    }

    public static void test_leap_year(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
