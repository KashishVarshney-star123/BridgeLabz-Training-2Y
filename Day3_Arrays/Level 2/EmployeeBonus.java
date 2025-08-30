import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] employeeData = new double[10][2]; 
        double[][] bonusData = new double[10][2];    

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter data for employee " + (i + 1) + ":");

            System.out.print("Enter current salary: ");
            double salary = scanner.nextDouble();

            System.out.print("Enter years of service: ");
            double yearsOfService = scanner.nextDouble();

            if (salary < 0 || yearsOfService < 0) {
                System.out.println("Invalid input. Salary and years of service cannot be negative. Please re-enter.");
                i--; 
                continue;
            }

            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }

        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus;

            if (yearsOfService > 5) {
                bonus = salary * 0.05; 
            } else {
                bonus = salary * 0.02; 
            }

            double newSalary = salary + bonus;

            bonusData[i][0] = newSalary;
            bonusData[i][1] = bonus;

            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
        }

        System.out.println("\nEmployee Bonus Payout Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("  Old Salary: Rs." + String.format("%.2f", employeeData[i][0]));
            System.out.println("  Bonus Amount: Rs." + String.format("%.2f", bonusData[i][1]));
            System.out.println("  New Salary: Rs." + String.format("%.2f", bonusData[i][0]));
        }

        System.out.println("\nCompany Totals:");
        System.out.println("Total Bonus Paid Out: Rs." + String.format("%.2f", totalBonus));
        System.out.println("Total Old Salary Payout: Rs." + String.format("%.2f", totalOldSalary));
        System.out.println("Total New Salary Payout: Rs." + String.format("%.2f", totalNewSalary));

        scanner.close();
    }
}