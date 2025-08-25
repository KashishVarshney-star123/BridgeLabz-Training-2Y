import java.util.Scanner;

public class friendsageheight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ages
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        // Input heights
        System.out.print("Enter Amar's height (in cm): ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter Akbar's height (in cm): ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter Anthony's height (in cm): ");
        double heightAnthony = sc.nextDouble();

        // Find youngest friend
        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngest = "";
        if (minAge == ageAmar) youngest = "Amar";
        else if (minAge == ageAkbar) youngest = "Akbar";
        else youngest = "Anthony";

        // Find tallest friend
        double maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallest = "";
        if (maxHeight == heightAmar) tallest = "Amar";
        else if (maxHeight == heightAkbar) tallest = "Akbar";
        else tallest = "Anthony";

        // Display results
        System.out.println("The youngest friend is: " + youngest + " (Age: " + minAge + ")");
        System.out.println("The tallest friend is: " + tallest + " (Height: " + maxHeight + " cm)");

        sc.close();
    }
}

