import java.util.Scanner;

public class Bmi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons in the team: ");
        int numPersons = scanner.nextInt();

        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] status = new String[numPersons];

        System.out.println("Enter weight (in kg) and height (in meters) for each person:");
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            weights[i] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (m): ");
            heights[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] <= 18.5) {
                status[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmis[i] >= 25.0 && bmis[i] <= 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.printf("  Weight: %.2f kg\n", weights[i]);
            System.out.printf("  Height: %.2f m\n", heights[i]);
            System.out.printf("  BMI: %.2f\n", bmis[i]);
            System.out.println("  Status: " + status[i]);
            System.out.println();
        }

        scanner.close();
    }
}