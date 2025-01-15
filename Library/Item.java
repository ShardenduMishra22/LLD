// Item.java - Abides by the Open/Closed Principle (OCP) and Liskov Substitution Principle (LSP)
public abstract class Item {
    private String title;
    private String id;

    public Item(String title, String id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public abstract double getValue();
}
