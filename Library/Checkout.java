public class Checkout {
    private Library library;

    public Checkout(Library library) {
        this.library = library;
    }

    public void checkout(String itemId) {
        library.checkoutItem(itemId);
    }

    public void printLibraryValue() {
        System.out.println("Total library value: " + library.getTotalLibraryValue());
    }
}