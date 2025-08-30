import java.util.Scanner;

public class FriendsData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        double[] ages = new double[3];
        double[] heights = new double[3];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter data for " + names[i] + ":");
            System.out.print("Enter age: ");
            ages[i] = scanner.nextDouble();
            System.out.print("Enter height (in meters): ");
            heights[i] = scanner.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < names.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nResults:");
        System.out.println("The youngest friend is: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("The tallest friend is: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + "m)");

        scanner.close();
    }
}
