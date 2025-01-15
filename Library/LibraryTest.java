import java.util.Arrays;

public class LibraryTest {
    public static void main(String[] args) {
        Item book = new Book("The Great Gatsby", "B1", "F. Scott Fitzgerald");
        Item cd = new CD("Thriller", "C1", "Michael Jackson");
        Item dvd = new DVD("Inception", "D1", "Christopher Nolan");

        Library library = new Library(Arrays.asList(book, cd, dvd));
        Checkout checkout = new Checkout(library);

        checkout.printLibraryValue();
        checkout.checkout("B1");
        checkout.printLibraryValue();
    }
}
