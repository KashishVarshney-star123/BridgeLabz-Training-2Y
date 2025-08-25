import java.util.Scanner;

public class doubleopt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values for a, b, and c
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();

    
        double result1 = a + b * c;  
        double result2 = a * b + c;   
        double result3 = c + a / b;   
        double result4 = a % b + c;   

        // Output results
        System.out.println("The results of Double Operations are: " 
                           + result1 + ", " 
                           + result2 + ", " 
                           + result3 + ", " 
                           + result4);
    }
}

