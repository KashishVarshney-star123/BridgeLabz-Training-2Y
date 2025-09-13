class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    public void displayStudent() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}
class PostgraduateStudent extends Student {
    private String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPostgraduateDetails() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name +
                           ", Specialization: " + specialization + ", CGPA: " + getCGPA());
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Alice", 8.7, "Computer Science");
        pg.displayPostgraduateDetails();

        System.out.println("Updating CGPA...");
        pg.setCGPA(9.2); 
        pg.displayPostgraduateDetails();
    }
}
