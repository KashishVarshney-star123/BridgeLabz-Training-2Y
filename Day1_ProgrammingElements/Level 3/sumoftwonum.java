import java.util.Scanner;

public class sumoftwonum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculating sum
        int sum = num1 + num2;

        // Printing result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}

