import java.util.Scanner;

public class BmiTwoD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double weight, height;
            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value. Please re-enter.");
                }
            } while (weight <= 0);
            
            do {
                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value. Please re-enter.");
                }
            } while (height <= 0);

            personData[i][0] = weight;
            personData[i][1] = height;
        }

        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d: Weight=%.2f kg, Height=%.2f m, BMI=%.2f, Status=%s\n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}
