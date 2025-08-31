import java.text.DecimalFormat;
import java.util.Random;

public class StudentScoreCard {
    public static int[][] generateRandomScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(100) + 1; 
            }
        }
        return scores;
    }
    public static double[][] calculateScores(int[][] scores) {
        double[][] calculatedScores = new double[scores.length][3];
        DecimalFormat df = new DecimalFormat("#.##");

        for (int i = 0; i < scores.length; i++) {
            double total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            calculatedScores[i][0] = total;
            double average = total / scores[i].length;
            calculatedScores[i][1] = Math.round(average * 100.0) / 100.0;
            double percentage = (total / (scores[i].length * 100.0)) * 100.0;
            calculatedScores[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return calculatedScores;
    }
    public static void displayScorecard(int[][] scores, double[][] calculatedScores) {
        System.out.println("Student Scorecard");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.print("S" + (i + 1) + "\t");
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t");
            System.out.print(calculatedScores[i][0] + "\t" + calculatedScores[i][1] + "\t" + calculatedScores[i][2] + "%");
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numberOfStudents = 5; 
        int[][] studentScores = generateRandomScores(numberOfStudents);
        double[][] finalScores = calculateScores(studentScores);
        displayScorecard(studentScores, finalScores);
    }
}
