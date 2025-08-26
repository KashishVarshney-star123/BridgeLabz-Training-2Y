import java.util.Scanner;

public class factorswhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if input is valid
        if (number < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("The factors of " + number + " are:");

            int i = 1; // Counter

            // While loop to find factors
            while (i <= number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++; // Increment counter
            }
        }

        sc.close();
    }
}

