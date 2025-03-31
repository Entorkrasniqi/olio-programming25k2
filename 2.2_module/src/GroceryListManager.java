import java.util.HashMap;
import java.util.ArrayList;

public class GroceryListManager {
    private HashMap<String, Item> groceryList = new HashMap<>();

    private class Item {
        String name;
        double cost;
        String category;

        public Item(String name, double cost, String category) {
            this.name = name;
            this.cost = cost;
            this.category = category;
        }
    }

    public void addItem(String item, double cost, String category) {
        groceryList.put(item, new Item(item, cost, category));
        System.out.println(item + " has been added to the " + category + " category with a cost of $" + cost);
    }

    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
            System.out.println(item + " has been removed from the grocery list.");
        } else {
            System.out.println(item + " is not in the grocery list.");
        }
    }

    public void displayList() {
        System.out.println("Grocery List:");
        if (groceryList.isEmpty()) {
            System.out.println("The grocery list is empty.");
        } else {
            for (String item : groceryList.keySet()) {
                Item currentItem = groceryList.get(item);
                System.out.println("- " + currentItem.name + " (" + currentItem.category + "): $" + currentItem.cost);
            }
        }
    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (Item currentItem : groceryList.values()) {
            totalCost += currentItem.cost;
        }
        return totalCost;
    }
    public void displayByCategory(String category) {
        System.out.println("Items in category: " + category);
        boolean found = false;
        for (Item currentItem : groceryList.values()) {
            if (currentItem.category.equalsIgnoreCase(category)) {
                System.out.println("- " + currentItem.name + ": $" + currentItem.cost);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found in this category.");
        }
    }
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Add items to the grocery list with their costs and categories
        manager.addItem("Apple", 1.20, "Fruits");
        manager.addItem("Banana", 0.50, "Fruits");
        manager.addItem("Milk", 2.50, "Dairy");
        manager.addItem("Eggs", 3.00, "Dairy");
        manager.addItem("Bread", 1.75, "Bakery");
        manager.displayList();

        // Calculate and display the total cost
        double totalCost = manager.calculateTotalCost();
        System.out.println("Total cost of all items: $" + totalCost);
        manager.displayByCategory("Fruits");
        manager.displayByCategory("Dairy");
        manager.displayByCategory("Bakery");
        manager.removeItem("Banana");
        manager.displayList();

        totalCost = manager.calculateTotalCost();
        System.out.println("Total cost of all items after removal: $" + totalCost);
    }
}
