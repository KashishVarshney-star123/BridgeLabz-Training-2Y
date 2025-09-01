import java.util.Scanner;

public class book {

    static void displayBookInfo(String title, String author, String id, boolean isAvailable) {
        System.out.println("\n=== Book Information ===");
        System.out.println("Book Title (Uppercase): " + title.toUpperCase()); 
        System.out.println("Author Name: " + author);
        System.out.println("Book ID (Uppercase): " + id.toUpperCase());      
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Length of Author Name: " + author.length());
    }

    static double calculateAverageRating(int[] ratings) {
        double sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return (ratings.length > 0) ? sum / ratings.length : 0;
    }

    static int calculateTotalRatings(int[] ratings) {
        return ratings.length;
    }

    static void compareAuthorNames(String a1, String a2) {
        if (a1.equalsIgnoreCase(a2)) {
            System.out.println("Author name matches with " + a2);
        } else {
            System.out.println("Comparing with 'Shakespeare' " + a2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String bookTitle = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String authorName = sc.nextLine();

        System.out.print("Enter Book ID: ");
        String bookId = sc.nextLine();

        System.out.print("Is the book available (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        System.out.print("Enter number of ratings: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("No ratings available!");
            return;
        }

        int[] bookRatings = new int[n];
        System.out.println("Enter ratings (1 to 5): ");
        for (int i = 0; i < n; i++) {
            bookRatings[i] = sc.nextInt();
        }

        displayBookInfo(bookTitle, authorName, bookId, isAvailable);
        compareAuthorNames(authorName, "Different authors");

        double average = calculateAverageRating(bookRatings);
        int total = calculateTotalRatings(bookRatings);

        System.out.println("\n=== Ratings Statistics ===");
        System.out.println("Total Ratings: " + total);
        System.out.println("Average Rating: " + average);

        for (int r : bookRatings) {
            if (r == 1) {
                System.out.println("One user gave a poor rating!");
            }
            System.out.println("Rating: " + r);
        }

        if (average >= 4) {
            System.out.println("Highly Rated Book!");
        } else {
            System.out.println("Average Book");
        }

        sc.close();
    }
}
