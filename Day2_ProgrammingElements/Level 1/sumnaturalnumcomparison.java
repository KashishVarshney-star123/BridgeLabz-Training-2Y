import java.util.Scanner;

public class sumnaturalnumcomparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if natural number
        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number");
        } else {
            // Compute using while loop
            int i = 1;
            int sumLoop = 0;
            while (i <= n) {
                sumLoop += i;
                i++;
            }

            // Compute using formula
            int sumFormula = n * (n + 1) / 2;

            // Output both results
            System.out.println("Sum of " + n + " natural numbers using while loop: " + sumLoop);
            System.out.println("Sum of " + n + " natural numbers using formula: " + sumFormula);

            // Compare results
            if (sumLoop == sumFormula) {
                System.out.println("Both computations are correct ✅");
            } else {
                System.out.println("There is a mismatch ❌");
            }
        }

        sc.close();
    }
}
