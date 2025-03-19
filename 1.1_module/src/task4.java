public class task4 {
    private String name;

    public task4(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Luodaan kissat
        task4 cat1 = new task4("Whiskers");
        task4 cat2 = new task4("Rex");

        // Tulostetaan vaadittu järjestys
        cat1.meow();
        cat2.meow();
        cat1.meow();
        cat1.meow();
    }
}
