class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;

    LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price +
                           ", Available: " + availability);
    }

    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("C++ Programming", "Bjarne Stroustrup", 350.0, true);

        lb.display();
        lb.borrowBook();
        lb.display();
    }
}
