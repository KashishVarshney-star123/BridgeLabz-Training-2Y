import java.util.Scanner;

public class Euclidean {

    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        return distance;
    }

    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first point (x1 y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter the coordinates of the second point (x2 y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        if (x1 == x2) {
            System.out.println("The line is vertical. The equation is x = " + x1);
            System.out.println("Euclidean distance: " + euclideanDistance(x1, y1, x2, y2));
        } else {
            double distance = euclideanDistance(x1, y1, x2, y2);
            System.out.println("Euclidean distance between the two points: " + distance);
            double[] lineParams = lineEquation(x1, y1, x2, y2);
            double slope = lineParams[0];
            double yIntercept = lineParams[1];

            System.out.println("The slope (m) of the line is: " + slope);
            System.out.println("The y-intercept (b) of the line is: " + yIntercept);
            System.out.println("The equation of the line is: y = " + slope + "x + " + yIntercept);
        }

        scanner.close();
    }
}
