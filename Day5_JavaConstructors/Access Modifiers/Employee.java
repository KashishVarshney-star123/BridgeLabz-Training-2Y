class Employee {
    public String employeeID;
    protected String department;
    private double salary;
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
            System.out.println("Salary updated successfully for employee " + this.employeeID);
        } else {
            System.out.println("Invalid salary. Salary must be a positive value.");
        }
    }
    public double getSalary() {
        return this.salary;
    }
}