import java.util.Scanner;

public class bmicalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for weight and height
        System.out.println("Enter weight in kilograms (kg):");
        double weight = scanner.nextDouble();

        System.out.println("Enter height in centimeters (cm):");
        double heightCm = scanner.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI using the formula: weight / (height * height)
        double bmi = weight / (heightMeters * heightMeters);

        String status;

        // Determine the weight status based on the BMI value
        if (bmi >= 40.0) {
            status = "Obese";
        } else if (bmi >= 25.0) {
            status = "Overweight";
        } else if (bmi >= 18.5) {
            status = "Normal";
        } else {
            status = "Underweight";
        }

        // Display the results
        System.out.printf("\nYour BMI is: %.2f\n", bmi);
        System.out.println("Your weight status is: " + status);

        scanner.close();
    }
}
