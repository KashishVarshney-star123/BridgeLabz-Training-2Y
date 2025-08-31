import java.util.Scanner;

public class TrigonometricFn {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();
        double[] results = calculateTrigonometricFunctions(angle);
        double sinValue = results[0];
        double cosValue = results[1];
        double tanValue = results[2];

        System.out.printf("Sine of %.2f degrees is: %.4f%n", angle, sinValue);
        System.out.printf("Cosine of %.2f degrees is: %.4f%n", angle, cosValue);
        System.out.printf("Tangent of %.2f degrees is: %.4f%n", angle, tanValue);

        scanner.close();
    }
}