import java.util.ArrayList;
import java.util.List;

class SafeList<T> {
    private final List<T> list = new ArrayList<>();

    public synchronized void add(T element) {
        list.add(element);
        System.out.println(Thread.currentThread().getName() + " added: " + element);
    }

    public synchronized void remove(T element) {
        if (list.remove(element)) {
            System.out.println(Thread.currentThread().getName() + " removed: " + element);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to remove: " + element + " (not found)");
        }
    }

    public synchronized int size() {
        int size = list.size();
        System.out.println(Thread.currentThread().getName() + " checked size: " + size);
        return size;
    }
}


//Option 1: Use synchronized keyword


//Wrap all three methods (add, remove, and size) with the synchronized keyword.



//This ensures that only one thread at a time can modify or read the list.




// Step 3: Implement the three methods.

//add(element) — adds an object to the list.
//remove(element) — removes the object if it exists.
//size() — returns the number of elements currently in the list.



// Step 4: Create a test class

//Create a separate test class, maybe SafeListTest, to simulate concurrent usage.


// Step 6: Observe results
//The goal is that the list doesn’t crash, overgrow incorrectly, or throw ConcurrentModificationException.
//Run multiple times — thread timing can reveal hidden issues.