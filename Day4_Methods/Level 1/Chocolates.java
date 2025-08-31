import java.util.Scanner;

public class Chocolates {
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        if (numberOfChildren <= 0) {
            System.out.println("Error: The number of children must be greater than zero.");
            return new int[]{0, numberOfChocolates};
        }
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of chocolates (N): ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children (M): ");
        int numberOfChildren = scanner.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Each child will get " + result[0] + " chocolate(s).");
        System.out.println("There will be " + result[1] + " chocolate(s) remaining.");

        scanner.close();
    }
}

