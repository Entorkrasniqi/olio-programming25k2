package active_recall;

public class Dog {
    String name; // attribute (data)

    void bark() { // method (behaviour)
        System.out.println(name + "woof nig!");
    }


public static Dog createAndShow() {
    Dog d1 = new Dog();
    d1.name = "koira";
    d1.bark();
    return d1;
}
public static void main(String[] args) {
createAndShow();
}

}