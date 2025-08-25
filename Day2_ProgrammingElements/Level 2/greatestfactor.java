import java.util.Scanner;

public class greatestfactor {
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

            // Loop from number-1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break; // Exit loop after finding the greatest factor
                }
            }

            // Display the result
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }

        sc.close();
    }
}
