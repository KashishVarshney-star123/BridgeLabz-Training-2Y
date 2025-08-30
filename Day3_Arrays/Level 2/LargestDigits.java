import java.util.Scanner;

public class LargestDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        int tempNumber = number;
        while (tempNumber != 0) {
            if (index == maxDigits) {
                System.out.println("The number has more than " + maxDigits + " digits. Processing stopped.");
                break;
            }
            digits[index] = tempNumber % 10;
            tempNumber /= 10;
            index++;
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }
        
        if (index > 0) {
            System.out.println("\nDigits of the number stored in an array:");
            for (int i = 0; i < index; i++) {
                System.out.print(digits[i] + " ");
            }
            System.out.println();
            
            System.out.println("\nLargest digit: " + largest);
            System.out.println("Second largest digit: " + (secondLargest != -1 ? secondLargest : "Not found (all digits are the same or less than two distinct digits)"));
        } else {
            System.out.println("The number entered is 0 or invalid.");
        }
    }
}
