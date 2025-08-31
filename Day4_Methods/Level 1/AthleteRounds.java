import java.util.Scanner;

public class AthleteRounds {

    public static int computeRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distanceToCover = 5000; //in meters
        if (perimeter == 0) {
            return 0; 
        }
        return (int) Math.floor(distanceToCover / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        int rounds = computeRounds(side1, side2, side3);
        System.out.println("The athlete can complete " + rounds + " full rounds.");

        scanner.close();
    }
}
