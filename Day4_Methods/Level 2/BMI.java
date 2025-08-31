import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TEAM_SIZE = 10;
        double[][] teamData = new double[TEAM_SIZE][3];

        System.out.println("Enter the weight (in kg) and height (in cm) for 10 team members:");
        for (int i = 0; i < TEAM_SIZE; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            teamData[i][1] = scanner.nextDouble();
        }
        
        calculateBMI(teamData);
        String[] bmiStatus = getBMIStatus(teamData);

        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s%-10s%-10s%-10s%-15s\n", "Person", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < TEAM_SIZE; i++) {
            System.out.printf("%-10d%-10.2f%-10.2f%-10.2f%-15s\n", 
                (i + 1), teamData[i][0], teamData[i][1], teamData[i][2], bmiStatus[i]);
        }
        
        scanner.close();
    }

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInMeters = heightInCm / 100.0; 
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }
    public static String[] getBMIStatus(double[][] data) {
        String[] statusArray = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            
            if (bmi <= 18.4) {
                statusArray[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statusArray[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                statusArray[i] = "Overweight";
            } else { // bmi >= 40.0
                statusArray[i] = "Obese";
            }
        }
        return statusArray;
    }
}
