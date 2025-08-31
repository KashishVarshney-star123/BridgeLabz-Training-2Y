import java.util.Scanner;

public class Handshakes {

    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        if (numberOfStudents < 0) {
            System.out.println("The number of students cannot be negative.");
        } else {
            int handshakes = calculateHandshakes(numberOfStudents);
            System.out.println("The maximum number of handshakes is: " + handshakes);
        }

        scanner.close();
    }
}
