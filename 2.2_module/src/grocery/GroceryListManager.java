package grocery;
import java.util.ArrayList;


public class GroceryListManager {
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();
        manager.addItem("apple");
        manager.addItem("banana");
        manager.addItem("poks");
        manager.displayList();    
        System.out.println(manager.checkItem("banana")); 
        manager.removeItem("banana");
        manager.displayList();
    }
// 1. private fields          — what it remembers
    private ArrayList<String> groceryList = new ArrayList<>();
    
    public void addItem(String item) {
        groceryList.add(item);
    }
    public void removeItem(String item) {
        groceryList.remove(item);
    }
    public void displayList() {
        System.out.println("Grocery List: ");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((1 + i) + ". " + groceryList.get(i));
        }
    }
    public boolean checkItem(String item) {
        return groceryList.contains(item);
        
    }

// 2. constructor             — starting values
// 3. methods                 — what it does, with the rules inside

// 4. getters                 — what outsiders may read
}
