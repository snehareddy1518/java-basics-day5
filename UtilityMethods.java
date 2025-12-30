public class UtilityMethods {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int square(int num) {
        return num * num;
    }

    public static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    public static String checkNumber(int num) {
        if (num > 0) return "Positive";
        else if (num < 0) return "Negative";
        else return "Zero";
    }

    public static int sumUpToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isEven(10));
        System.out.println(square(5));
        System.out.println(findMax(8, 12));
        System.out.println(checkNumber(-3));
        System.out.println(sumUpToN(5));
    }
}