import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary
        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();

        // Input years of service
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = sc.nextInt();

        double bonus = 0.0;

        // Check if employee is eligible for bonus
        if (yearsOfService > 5) {
            bonus = salary * 0.05;  // 5% bonus
        }

        // Output bonus
        System.out.println("The bonus amount is: " + bonus);

        sc.close();
    }
}

