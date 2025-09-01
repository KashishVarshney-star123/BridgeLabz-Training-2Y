import java.util.*;
public class Student{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("name1", "name2"));
        Scanner scanner = new Scanner(System.in);
        String[] names = {"name1", "name2"};
        System.out.print("Enter your name1: ");
        String a = scanner.nextLine();
        System.out.print("Enter your name2: ");
        String b = scanner.nextLine();
        scanner.close();
        boolean areEqual = names[0].equals(names[1]);
        System.out.println("Are the names equal? " + areEqual);

        /*boolean areEqualReference = a==b;
        System.out.println("Are the names equal? " + areEqualReference);*/

        if(list.contains("name1") && list.contains("name2")) {
            System.out.println("Student registered.");
        } else {
            System.out.println("Student Not Found.");
        }

    }
    public static void registered(String[] args) {
        
    }

}
