import java.util.Scanner;

public class yardsandmiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert to yards and miles
        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;

        // Output
        System.out.println("The distance " + distanceInFeet + " feet is equal to:");
        System.out.println(distanceInYards + " yards");
        System.out.println(distanceInMiles + " miles");
    }
}

