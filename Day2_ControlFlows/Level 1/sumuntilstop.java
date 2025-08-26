import java.util.Scanner;

public class sumuntilstop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;  // To store sum

        while (true) {  // Infinite loop
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble();

            if (number <= 0) {  // If 0 or negative → exit loop
                break;
            }

            total += number;  // Add to sum
        }

        System.out.println("The total sum is: " + total);

        sc.close();
    }
}

