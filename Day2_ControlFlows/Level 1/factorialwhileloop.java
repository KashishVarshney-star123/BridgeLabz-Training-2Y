import java.util.Scanner;

public class factorialwhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check if input is valid
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int i = 1;
            long factorial = 1; // long to handle large results

            // Compute factorial using while loop
            while (i <= n) {
                factorial *= i;
                i++;
            }

            // Output
            System.out.println("The factorial of " + n + " is " + factorial);
        }

        sc.close();
    }
}

