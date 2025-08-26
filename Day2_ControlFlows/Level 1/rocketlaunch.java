import java.util.Scanner;

public class rocketlaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement counter
        }

        // Final message after countdown
        System.out.println("Liftoff! 🚀");

        sc.close();
    }
}

