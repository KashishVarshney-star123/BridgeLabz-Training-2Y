import java.util.Scanner;

public class intoperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values for a, b, and c
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        // Perform integer operations considering operator precedence
        int result1 = a + b * c;    // Multiplication happens before addition
        int result2 = a * b + c;    // Multiplication happens before addition
        int result3 = c + a / b;    // Division happens before addition
        int result4 = a % b + c;    // Modulus happens before addition

        // Output results
        System.out.println("The results of Int Operations are: " 
                           + result1 + ", " 
                           + result2 + ", " 
                           + result3 + ", " 
                           + result4);
    }
}

