import java.util.Scanner;

public class handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Formula to calculate maximum handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output
        System.out.println("The maximum number of possible handshakes among " 
                           + numberOfStudents + " students is " + handshakes);
    }
}

