import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter base of triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle (in inches): ");
        double height = input.nextDouble();

        // Area in square inches
        double areaInches = 0.5 * base * height;

        // Convert to square centimeters
        double areaCm = areaInches * 6.4516;

        // Output
        System.out.println("The area of the triangle with base " + base + " inches and height " + height + " inches is:");
        System.out.println(areaInches + " square inches");
        System.out.println(areaCm + " square centimeters");
    }
}

