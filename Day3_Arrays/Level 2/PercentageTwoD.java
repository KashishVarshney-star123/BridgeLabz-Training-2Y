import java.util.Scanner;

public class PercentageTwoD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        double[][] marks = new double[numStudents][3]; 
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                double mark;
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                do {
                    System.out.print("Enter " + subject + " marks (0-100): ");
                    mark = scanner.nextDouble();
                    if (mark < 0 || mark > 100) {
                        System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                    }
                } while (mark < 0 || mark > 100);
                marks[i][j] = mark;
            }
        }

        for (int i = 0; i < numStudents; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        System.out.println("\n--- Student Report Card ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.printf("  Marks: Physics=%.2f, Chemistry=%.2f, Maths=%.2f\n",
                    marks[i][0], marks[i][1], marks[i][2]);
            System.out.printf("  Percentage: %.2f%%\n", percentages[i]);
            System.out.println("  Grade: " + grades[i]);
        }

        scanner.close();
    }
}
