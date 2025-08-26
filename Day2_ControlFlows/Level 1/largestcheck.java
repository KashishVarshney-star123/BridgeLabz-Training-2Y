import java.util.Scanner;

public class largestcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        // Check largest
        boolean firstLargest  = (number1 >= number2) && (number1 >= number3);
        boolean secondLargest = (number2 >= number1) && (number2 >= number3);
        boolean thirdLargest  = (number3 >= number1) && (number3 >= number2);

        // Output
        System.out.println("Is the first number the largest? " + (firstLargest ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (secondLargest ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (thirdLargest ? "Yes" : "No"));

        sc.close();
    }
}

