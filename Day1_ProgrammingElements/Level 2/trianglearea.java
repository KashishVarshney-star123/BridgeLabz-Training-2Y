import java.util.Scanner;

public class trianglearea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking base and height in cm
        System.out.print("Enter base of the triangle (in cm): ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle (in cm): ");
        double height = input.nextDouble();

        // Area in square centimeters
        double areaCm = 0.5 * base * height;

        // Area in square inches
        double areaInches = areaCm / 6.4516;

        // Output
        System.out.println("The Area of the triangle in sq in is " + areaInches +
                           " and sq cm is " + areaCm);
    }
}
