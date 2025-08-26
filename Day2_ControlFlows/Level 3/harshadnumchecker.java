import java.util.Scanner;

public class harshadnumchecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it's a Harshad Number:");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sumOfDigits = 0;
        int tempNumber = number;

        // a. Calculate the sum of the digits
        while (tempNumber > 0) {
            int digit = tempNumber % 10; // Get the last digit
            sumOfDigits += digit;       // Add the digit to the sum
            tempNumber /= 10;           // Remove the last digit
        }

        // b. Check if the original number is perfectly divisible by the sum of its digits
        if (sumOfDigits != 0 && originalNumber % sumOfDigits == 0) {
            System.out.println(originalNumber + " is a Harshad Number (divisible by " + sumOfDigits + ").");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        scanner.close();
    }
}
