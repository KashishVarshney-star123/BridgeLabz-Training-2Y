import java.util.Scanner;

public class SumOfNaturalNo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (n) to find its sum: ");
        int n = scanner.nextInt();
        
        if (n < 1) {
            System.out.println("Invalid input. Please enter a natural number (n >= 1).");
        } else {
            long sumRecursive = findSumUsingRecursion(n);
            long sumFormula = findSumUsingFormula(n);
            
            System.out.println("Sum using recursion: " + sumRecursive);
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("The results are correct: " + (sumRecursive == sumFormula));
        }
    }

    public static long findSumUsingRecursion(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + findSumUsingRecursion(n - 1);
        }
    }

    public static long findSumUsingFormula(int n) {
        return (long) n * (n + 1) / 2;
    }
}
