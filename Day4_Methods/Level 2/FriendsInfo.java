import java.util.Scanner;

public class FriendsInfo {
    public static String findYoungest(int[] ages, String[] names) {
        int minAge = ages[0];
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return names[index] + " (Age: " + minAge + ")";
    }
    public static String findTallest(int[] heights, String[] names) {
        int maxHeight = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return names[index] + " (Height: " + maxHeight + " cm)";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        System.out.println("\nYoungest Friend: " + findYoungest(ages, names));
        System.out.println("Tallest Friend: " + findTallest(heights, names));

        sc.close();
    }
}

