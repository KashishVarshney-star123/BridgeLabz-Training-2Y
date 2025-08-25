import java.util.Scanner;

public class circlearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input radius
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Calculate area
        double area = Math.PI * radius * radius;

        // Output result
        System.out.println("The area of the circle with radius " + radius + " is " + area);
    }
}

