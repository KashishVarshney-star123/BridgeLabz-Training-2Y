import java.util.Scanner;

public class cylindervolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input radius and height
        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        // Calculate volume
        double volume = Math.PI * radius * radius * height;

        // Output result
        System.out.println("The volume of the cylinder with radius " + radius + 
                           " and height " + height + " is " + volume);
    }
}

