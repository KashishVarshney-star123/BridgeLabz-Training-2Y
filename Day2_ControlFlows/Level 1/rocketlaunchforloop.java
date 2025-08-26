import java.util.Scanner;

public class rocketlaunchforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Final message after countdown
        System.out.println("Liftoff! 🚀");

        sc.close();
    }
}

