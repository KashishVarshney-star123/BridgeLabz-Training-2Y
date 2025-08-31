import java.util.Random;

public class EmployeeBonus {
    public static void main(String[] args) {
        final int NUM_EMPLOYEES = 10;
        double[][] employeeData = new double[NUM_EMPLOYEES][2];
        generateEmployeeData(employeeData);
        double[][] updatedData = calculateBonus(employeeData);
        displayBonusReport(employeeData, updatedData);
    }
    public static void generateEmployeeData(double[][] data) {
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i][0] = 10000 + random.nextInt(90000); 
            data[i][1] = random.nextInt(11); 
        }
    }
    public static double[][] calculateBonus(double[][] oldData) {
        double[][] updatedData = new double[oldData.length][2];
        for (int i = 0; i < oldData.length; i++) {
            double salary = oldData[i][0];
            double yearsOfService = oldData[i][1];
            double bonus;

            if (yearsOfService > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }
            
            updatedData[i][0] = bonus;
            updatedData[i][1] = salary + bonus;
        }
        return updatedData;
    }
    public static void displayBonusReport(double[][] oldData, double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n", "Emp ID", "Years of Service", "Old Salary", "Bonus Amount", "New Salary");
        System.out.println("---------------------------------------------------------------------------------");
        
        for (int i = 0; i < oldData.length; i++) {
            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double bonus = updatedData[i][0];
            double newSalary = updatedData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-15.0f %-15.2f %-15.2f %-15.2f%n", (i + 1), years, oldSalary, bonus, newSalary);
        }

        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-41s %-15.2f %-15.2f%n", "Total", totalBonus, totalNewSalary);
        System.out.println("---------------------------------------------------------------------------------");
    }
}