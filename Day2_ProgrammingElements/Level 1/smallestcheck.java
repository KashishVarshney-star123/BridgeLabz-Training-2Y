import java.util.Scanner;

public class smallestcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        // Check if first number is smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Output
        System.out.println("Is the first number the smallest? " + (isSmallest ? "Yes" : "No"));

        sc.close();
    }
}

