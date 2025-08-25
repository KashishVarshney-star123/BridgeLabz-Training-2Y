import java.util.Scanner;

public class primenumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPrime = true;

        System.out.println("Enter a number to check if it's a prime number:");
        int number = scanner.nextInt();

        // Prime numbers must be greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 up to the number (exclusive) to check for divisors
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // Exit the loop as soon as a divisor is found
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
