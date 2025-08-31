import java.util.Scanner;

public class Collinearity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates for Point A (x1, y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates for Point B (x2, y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Enter coordinates for Point C (x3, y3):");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        System.out.println("\nChecking for collinearity:");
        if (areCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Using Slope Formula: The points are collinear.");
        } else {
            System.out.println("Using Slope Formula: The points are NOT collinear.");
        }
        if (areCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Using Area of Triangle Formula: The points are collinear.");
        } else {
            System.out.println("Using Area of Triangle Formula: The points are NOT collinear.");
        }
    }
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        if ((x2 - x1) == 0 || (x3 - x2) == 0) {
            return (x2 - x1) == 0 && (x3 - x2) == 0;
        }

        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        final double epsilon = 1e-9;
        return Math.abs(slopeAB - slopeBC) < epsilon;
    }
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        final double epsilon = 1e-9;
        return Math.abs(area) < epsilon;
    }
}
