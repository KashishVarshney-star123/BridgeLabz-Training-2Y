import java.util.Scanner;

public class powerofnum {
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

            // Calculate power using for loop
            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            // Output the result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        sc.close();
    }
}
