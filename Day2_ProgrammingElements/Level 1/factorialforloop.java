import java.util.Scanner;

public class factorialforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check if input is valid
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; // long to handle large results

            // Compute factorial using for loop
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            // Output
            System.out.println("The factorial of " + n + " is " + factorial);
        }

        sc.close();
    }
}

