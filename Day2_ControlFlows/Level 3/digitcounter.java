import java.util.Scanner;

public class digitcounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to count its digits:");
        int number = scanner.nextInt();

        // Handle the special case of 0
        if (number == 0) {
            System.out.println("The number of digits is 1.");
            scanner.close();
            return;
        }
        
        // Use Math.abs to handle negative numbers
        int tempNumber = Math.abs(number);
        int count = 0;

        while (tempNumber > 0) {
            tempNumber /= 10; // Removes the last digit
            count++;          // Increments the counter
        }

        System.out.println("The number of digits is " + count + ".");

        scanner.close();
    }
}
