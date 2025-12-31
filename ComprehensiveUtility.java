public class ComprehensiveUtility {
    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /* ========== STRING UTILITIES ========== */

    static String reverseString(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    static boolean isPalindrome(String s) {
        String rev = reverseString(s);
        return s.equalsIgnoreCase(rev);
    }

    static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    static String removeDuplicates(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }
        return result;
    }

    /* ========== ARRAY UTILITIES ========== */

    static void sortArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    static int search(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key)
                return i;
        }
        return -1;
    }

    static int findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    static int findMin(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }

    static void reverseArray(int[] a) {
        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    /* ========== MAIN METHOD (TESTING) ========== */

    public static void main(String[] args) {

        // Math test
        System.out.println("Power: " + power(2, 3));
        System.out.println("Factorial: " + factorial(5));
        System.out.println("Is Prime: " + isPrime(11));
        System.out.println("GCD: " + gcd(20, 30));

        // String test
        System.out.println("Reverse: " + reverseString("hello"));
        System.out.println("Palindrome: " + isPalindrome("madam"));
        System.out.println("Vowels: " + countVowels("education"));
        System.out.println("Remove Duplicates: " + removeDuplicates("banana"));

        // Array test
        int[] arr = {5, 3, 8, 1, 2};

        sortArray(arr);
        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Search 8: Index " + search(arr, 8));
        System.out.println("Max: " + findMax(arr));
        System.out.println("Min: " + findMin(arr));

        reverseArray(arr);
        System.out.print("Reversed Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}