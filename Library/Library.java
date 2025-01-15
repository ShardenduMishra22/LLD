// Library.java - Adheres to the Single Responsibility Principle (SRP) and Interface Segregation Principle (ISP)
import java.util.List;

public class Library {
    private List<Item> items;

    public Library(List<Item> items) {
        this.items = items;
    }

    public void checkoutItem(String itemId) {
        for (Item item : items) {
            if (item.getId().equals(itemId)) {
                items.remove(item);
                System.out.println(item.getTitle() + " has been checked out.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public double getTotalLibraryValue() {
        double totalValue = 0;
        for (Item item : items) {
            totalValue += item.getValue();
        }
        return totalValue;
    }

    public List<Item> getItems() {
        return items;
    }
}
