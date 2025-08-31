import java.util.Scanner;

public class PerfectEtcNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();

        System.out.println("Is " + number + " a Perfect Number? " + isPerfect(number));
        System.out.println("Is " + number + " an Abundant Number? " + isAbundant(number));
        System.out.println("Is " + number + " a Deficient Number? " + isDeficient(number));
        System.out.println("Is " + number + " a Strong Number? " + isStrong(number));
    }
    private static int getSumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static boolean isPerfect(int number) {
        if (number <= 0) {
            return false;
        }
        return getSumOfProperDivisors(number) == number;
    }
    public static boolean isAbundant(int number) {
        if (number <= 0) {
            return false;
        }
        return getSumOfProperDivisors(number) > number;
    }
    public static boolean isDeficient(int number) {
        if (number <= 0) {
            return false;
        }
        return getSumOfProperDivisors(number) < number;
    }
    private static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static boolean isStrong(int number) {
        int originalNumber = number;
        long sumOfFactorials = 0;
        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }
        return sumOfFactorials == originalNumber;
    }
}
