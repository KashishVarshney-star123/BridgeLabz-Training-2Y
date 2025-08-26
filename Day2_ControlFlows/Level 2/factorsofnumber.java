import java.util.Scanner;

public class factorsofnumber {
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

            // Loop to find factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}

