// Book.java - Inherits from Item and adheres to LSP and OCP
public class Book extends Item {
    private String author;

    public Book(String title, String id, String author) {
        super(title, id);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public double getValue() {
        return 20.0; // Example fixed value for books
    }
}
