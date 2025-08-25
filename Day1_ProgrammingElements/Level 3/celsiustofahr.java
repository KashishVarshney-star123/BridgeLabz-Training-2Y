import java.util.Scanner;

public class celsiustofahr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        // Output result
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
    }
}

