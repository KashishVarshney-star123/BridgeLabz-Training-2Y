import java.util.Scanner;

public class armstrongnumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it's an Armstrong number:");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sumOfCubes = 0;

        // Count the number of digits
        int numberOfDigits = 0;
        int tempNumber = originalNumber;
        while (tempNumber != 0) {
            tempNumber /= 10;
            numberOfDigits++;
        }

        tempNumber = originalNumber; // Reset tempNumber for the next loop

        // Calculate the sum of the cubes of each digit
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sumOfCubes += Math.pow(digit, numberOfDigits);
            tempNumber /= 10;
        }

        // Check if the original number and the sum are equal
        if (sumOfCubes == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
