import java.util.Scanner;

public class powerwhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power (non-negative integer): ");
        int power = sc.nextInt();

        // Check for valid input
        if (power < 0) {
            System.out.println("Please enter a non-negative integer for the power.");
        } else {
            long result = 1; // Initialize result
            int counter = 0; // Initialize counter

            // While loop to calculate power
            while (counter < power) {
                result *= number;
                counter++; // Increment counter
            }

            // Output the result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        sc.close();
    }
}
