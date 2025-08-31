import java.util.Arrays;

public class HarshadNum {
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
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += (int) Math.pow(d, 2);
        }
        return sum;
    }
    public static boolean isHarshad(int num) {
        int[] digits = getDigits(num);
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }
    public static int[][] digitFrequency(int num) {
        int[] digits = getDigits(num);
        int[] freq = new int[10]; 

        for (int d : digits) {
            freq[d]++;
        }
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = freq[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int num = 221;

        System.out.println("Number: " + num);
        System.out.println("Count of digits: " + countDigits(num));
        int[] digits = getDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        if (isHarshad(num)) {
            System.out.println(num + " is a Harshad Number");
        } else {
            System.out.println(num + " is NOT a Harshad Number");
        }
        System.out.println("Digit Frequencies:");
        int[][] freq = digitFrequency(num);
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " occurs " + freq[i][1] + " times");
            }
        }
    }
}

