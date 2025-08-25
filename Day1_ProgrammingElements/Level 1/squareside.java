import java.util.Scanner;

public class squareside {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate side
        double side = perimeter / 4.0;

        // Output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}

