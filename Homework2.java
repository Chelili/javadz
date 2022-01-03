/**
 *Java 1. Homework #2
 *
 * @author Liliya Chernobay
 * @version 16.12.2021
 */
class Homework2 {

    public static void main(String[]arg) {
        System.out.println(isBetween10And20(5, 25));
        System.out.println(isBetween10And20(-5, 0));
        System.out.println(isBetween10And20(10, 15));

        isPositiveOrNegative(-1);
        isPositiveOrNegative(0);
        isPositiveOrNegative(1);

        System.out.println(isNegative(-1));
        System.out.println(isNegative(0));
        System.out.println(isNegative(1));

        repeatString("Hello, world!", 5);

        System.out.println(isYearLeap(1900));
        System.out.println(isYearLeap(2000));
        System.out.println(isYearLeap(1910));
        System.out.println(isYearLeap(2010));

    }

    static boolean isBetween10And20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void isPositiveOrNegative(int a) {
        System.out.println(a >= 0 ? "Positive" : "Negative");
    }

    static boolean isNegative(int a) {
        return a < 0;
    }

    static void repeatString(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }

    static boolean isYearLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

}
