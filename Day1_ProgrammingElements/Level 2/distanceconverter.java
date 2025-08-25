import java.util.Scanner;

public class distanceconverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Convert feet to yards and miles
        double distanceInYards = distanceInFeet / 3;   // since 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760; // since 1 mile = 1760 yards

        // Output results
        System.out.println("The distance in yards is " + distanceInYards + 
                           " while the distance in miles is " + distanceInMiles);
    }
}

