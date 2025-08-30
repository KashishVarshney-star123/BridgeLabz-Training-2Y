import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                System.out.print(num + " is Positive and ");
                if (num % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.print("First element (" + first + ") and Last element (" + last + ") are ");
        if (first == last) {
            System.out.println("Equal");
        } else if (first > last) {
            System.out.println("First is Greater");
        } else {
            System.out.println("Last is Greater");
        }
    }
}

