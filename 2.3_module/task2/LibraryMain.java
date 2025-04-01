public class LibraryMain {
    public static void main(String[] args) {
        // Luo kirjasto
        Library library = new Library();

        // Luo kirjat
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book4 = new Book("Moby Dick", "Herman Melville", 1851);
        Book book5 = new Book("War and Peace", "Leo Tolstoy", 1869);

        // Lisää kirjat kirjastoon
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        // Näytä kirjat kirjastossa
        library.displayBooks();

        // Lainaa kirjaa
        library.borrowBook("1984");

        // Tarkista onko kirja tallessa
        System.out.println("\nIs '1984' available? " + library.isBookAvailable("1984"));
        System.out.println("Is 'The Great Gatsby' available? " + library.isBookAvailable("The Great Gatsby"));

        // Palauta kirja
        library.returnBook(book1);

        // arvioi kirja
        book1.setRating(4.5);
        book1.addReview("A thought-provoking novel.");
        book1.addReview("Great political commentary.");

        // Näytä kirjat lainaukset jölkeen
        library.displayBooks();
    }
}
