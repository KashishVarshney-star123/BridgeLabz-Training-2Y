import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        if (number == 0) {
            System.out.println("Frequency of digit 0: 1");
            return;
        }
        int tempNumber = number;
        int count = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }
        
        int[] digits = new int[count];
        int index = 0;
        tempNumber = number;
        while (tempNumber != 0) {
            digits[index] = tempNumber % 10;
            tempNumber /= 10;
            index++;
        }
        
        int[] frequency = new int[10]; 
        for (int digit : digits) {
            frequency[digit]++;
        }
        
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Frequency of digit " + i + ": " + frequency[i]);
            }
        }
    }
}