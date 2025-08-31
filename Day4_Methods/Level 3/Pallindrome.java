import java.util.Arrays;

public class Pallindrome {
    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }
    public static int[] getDigits(int num) {
        String s = String.valueOf(Math.abs(num));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }
    public static boolean isDuckNumber(int num) {
        int[] digits = getDigits(num);
        if (digits[0] == 0) {
            return false;
        }
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 12021;
        System.out.println("Number: " + num);
        System.out.println("Count of digits: " + countDigits(num));
        int[] digits = getDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));
        int[] reversed = reverseArray(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));
        System.out.println("Arrays Equal? " + areArraysEqual(digits, reversed));
        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome number");
        } else {
            System.out.println(num + " is NOT a Palindrome number");
        }
        if (isDuckNumber(num)) {
            System.out.println(num + " is a Duck number");
        } else {
            System.out.println(num + " is NOT a Duck number");
        }
    }
}

