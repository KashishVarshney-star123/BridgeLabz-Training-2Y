import java.util.Random;

public class FootballTeam {
    public static void main(String[] args) {
        int[] playerHeights = generateRandomHeights(11, 150, 250);
        System.out.println("Player Heights: " + java.util.Arrays.toString(playerHeights));
        System.out.println("Shortest Height: " + findShortestHeight(playerHeights) + " cm");
        System.out.println("Tallest Height: " + findTallestHeight(playerHeights) + " cm");
        System.out.println("Mean Height: " + findMeanHeight(playerHeights) + " cm");
    }
    public static int[] generateRandomHeights(int size, int min, int max) {
        int[] heights = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            heights[i] = random.nextInt(max - min + 1) + min;
        }
        return heights;
    }
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int height : arr) {
            sum += height;
        }
        return sum;
    }
    public static double findMeanHeight(int[] heights) {
        if (heights.length == 0) {
            return 0.0;
        }
        return (double) findSum(heights) / heights.length;
    }
    public static int findShortestHeight(int[] heights) {
        if (heights.length == 0) {
            return -1; 
        }
        int shortest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }
    public static int findTallestHeight(int[] heights) {
        if (heights.length == 0) {
            return -1; 
        }
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }
}