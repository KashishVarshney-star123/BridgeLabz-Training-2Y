import java.util.Scanner;

public class sumuntilzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;   // To store sum
        double number;        // To store user input

        System.out.print("Enter a number (0 to stop): ");
        number = sc.nextDouble();

        // Continue until user enters 0
        while (number != 0) {
            total += number;  // Add number to total
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();
        }

        // Display total
        System.out.println("The total sum is: " + total);

        sc.close();
    }
}

