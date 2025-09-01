public class pattern {
    public static void main(String[] args) {
        int n = 4; // number of rows
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
