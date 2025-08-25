import java.util.Scanner;

public class fizzbuzzwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check if input is positive
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1;  // Initialize counter

            // Loop using while
            while (i <= n) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }

                i++;  // Increment counter
            }
        }

        sc.close();
    }
}

