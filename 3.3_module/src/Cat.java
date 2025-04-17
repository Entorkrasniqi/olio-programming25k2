public class Cat {

    //täytä ite
    private String name;
    private String voice;
    private static int count = 0;

    public Cat(String name, String voice) {
        this.name = name;
        this.name = voice;
        count++;
    }

    public String say() {
        return name + ": " + voice;
    }

    public static int getCatCount() {
        return count;
    }
//koe anto 
    public static void main(String[] args) {
        Cat cat1 = new Cat ("misse", "Mjau");
        Cat cat2 = new Cat("Pekka", "Vuff");

        System.out.println(cat1.say());
        System.out.println(cat2.say());
        System.out.println(Cat.getCatCount());
    }
}
