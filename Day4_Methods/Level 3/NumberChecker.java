import java.util.ArrayList;
import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);
        ArrayList<Integer> digits = storeDigits(number);
        System.out.println("Digits: " + digits);
        System.out.println("Is it a Duck Number? " + isDuckNumber(digits));
        System.out.println("Is it an Armstrong Number? " + isArmstrongNumber(number, digitCount));
        int[] largestDigits = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestDigits[0]);
        System.out.println("Second largest digit: " + largestDigits[1]);
        int[] smallestDigits = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestDigits[0]);
        System.out.println("Second smallest digit: " + smallestDigits[1]);
    }
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    public static ArrayList<Integer> storeDigits(int number) {
        ArrayList<Integer> digits = new ArrayList<>();
        String numStr = String.valueOf(number);
        for (int i = 0; i < numStr.length(); i++) {
            digits.add(Character.getNumericValue(numStr.charAt(i)));
        }
        return digits;
    }
    public static boolean isDuckNumber(ArrayList<Integer> digits) {
        if (digits.get(0) == 0) {
            return false;
        }
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean isArmstrongNumber(int number, int digitCount) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digitCount);
            number /= 10;
        }
        return sum == originalNumber;
    }
    public static int[] findLargestAndSecondLargest(ArrayList<Integer> digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }
    public static int[] findSmallestAndSecondSmallest(ArrayList<Integer> digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
}
