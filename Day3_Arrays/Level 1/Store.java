import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];  // array of size 10
        double total = 0.0;
        int index = 0;

        // Infinite loop until user enters 0, negative, or reaches max size
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            if (num <= 0) { // stop if 0 or negative entered
                break;
            }

            if (index == 10) { // stop if array is full
                System.out.println("Array is full! Cannot add more numbers.");
                break;
            }

            numbers[index] = num; // store value
            index++; // move to next index
        }

        // Display stored numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i]; // calculate sum
        }

        // Display total
        System.out.println("\nTotal sum = " + total);
    }
}

