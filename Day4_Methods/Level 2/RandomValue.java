import java.util.Arrays;
import java.util.Random;

public class RandomValue {

    public static void main(String[] args) {
        final int COUNT = 5;

        System.out.println("--- Random Number Analysis ---");
        int[] randomNumbers = generate4DigitRandomArray(COUNT);
        System.out.println("Generated numbers: " + Arrays.toString(randomNumbers));

        double[] results = findAverageMinMax(randomNumbers);
        System.out.println("Average value: " + results[0]);
        System.out.println("Minimum value: " + results[1]);
        System.out.println("Maximum value: " + results[2]);
    }
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(9000) + 1000;
        }
        return numbers;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) {
            return new double[]{0, 0, 0};
        }

        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = sum / numbers.length;
        
        return new double[]{average, min, max};
    }
}
