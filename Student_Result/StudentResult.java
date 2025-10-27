class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class StudentResult{

    public static void main(String[] args) {
        String name = null;
        int age = 17;
        int[] marks = {85, 92, 78};

        try {
            if (name == null) {
                throw new NullPointerException("Student name is missing");
            }
            if (age < 18) {
                throw new InvalidAgeException("Student must be at least 18 years old.");
            }
            for (int mark : marks) {
                if (mark < 0 || mark > 100) {
                    throw new InvalidMarksException("Marks must be between 0 and 100.");
                }
            }
            double average = 0;
            if (marks.length == 0) {
                throw new ArithmeticException("No marks available to calculate average.");
            } else {
                int sum = 0;
                for (int mark : marks) {
                    sum += mark;
                }
                average = sum / (double) marks.length;
                System.out.println("Average Marks: " + average);
            }
            System.out.println("Accessing extra index: " + marks[3]);
            
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access an invalid index in marks array.");
        } finally {
            System.out.println("Result processing completed.");
        }
    }
}