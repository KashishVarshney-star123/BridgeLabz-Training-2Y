import java.util.Scanner;

public class MaxDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        int tempNumber = number;
        if (tempNumber == 0) {
            digits[index] = 0;
            index++;
        }

        while (tempNumber != 0) {
            if (index == maxDigits) {
                maxDigits += 10;
                int[] tempArray = new int[maxDigits];
                for (int i = 0; i < digits.length; i++) {
                    tempArray[i] = digits[i];
                }
                
                digits = tempArray;
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

        System.out.println("\nDigits of the number:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest != -1 ? secondLargest : "Not found (all digits are the same or less than two distinct digits)"));
    }
}
