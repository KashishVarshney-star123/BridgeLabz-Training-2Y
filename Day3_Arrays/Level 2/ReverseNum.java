import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int tempNumber = number;
        int count = 0;
        
        if (tempNumber == 0) {
            count = 1;
        } else {
            while (tempNumber != 0) {
                tempNumber /= 10;
                count++;
            }
        }
        
        int[] digits = new int[count];
        int index = 0;
        tempNumber = number;
        
        if (tempNumber == 0) {
            digits[0] = 0;
        } else {
            while (tempNumber != 0) {
                digits[index] = tempNumber % 10;
                tempNumber /= 10;
                index++;
            }
        }

        System.out.println("\nDigits of the number in reverse order:");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
    }
}
