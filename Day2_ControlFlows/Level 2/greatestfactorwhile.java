import java.util.Scanner;

public class greatestfactorwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if input is valid
        if (number < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int greatestFactor = 1; // Initialize greatest factor
            int counter = number - 1; // Start from number-1

            // While loop to find greatest factor
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break; // Exit loop after finding the greatest factor
                }
                counter--; // Decrement counter
            }

            // Display the result
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }

        sc.close();
    }
}
