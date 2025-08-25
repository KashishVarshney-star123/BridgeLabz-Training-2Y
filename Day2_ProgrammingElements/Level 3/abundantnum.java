import java.util.Scanner;

public class abundantnum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it's an Abundant Number:");
        int number = scanner.nextInt();

        // Abundant numbers are positive integers
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return;
        }

        int sumOfDivisors = 0;

        // a. Find all proper divisors (from 1 up to number - 1) and sum them
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i; // Add the divisor to the sum
            }
        }

        // b. Check if the sum of divisors is greater than the number
        if (sumOfDivisors > number) {
            System.out.println(number + " is an Abundant Number (Sum of divisors: " + sumOfDivisors + ").");
        } else {
            System.out.println(number + " is NOT an Abundant Number (Sum of divisors: " + sumOfDivisors + ").");
        }

        scanner.close();
    }
}