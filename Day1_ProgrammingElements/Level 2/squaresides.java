import java.util.Scanner;

public class squaresides {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take perimeter input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate side
        double side = perimeter / 4.0;

        // Output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}

