class Book {
    public String ISBN;
    protected String title;
    private String author; 
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBook() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}
class EBook extends Book {
    private String format;

    EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    public void displayEBook() {
        System.out.println("E-Book ISBN: " + ISBN + ", Title: " + title +
                           ", Format: " + format + ", Author: " + getAuthor());
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("978-0135166307", "Effective Java", "Joshua Bloch", "PDF");
        ebook.displayEBook();

        System.out.println("Changing Author...");
        ebook.setAuthor("J. Bloch");
        ebook.displayEBook();
    }
}
