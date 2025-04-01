import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Methodi lisätä kirjat kirjastoon
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Methodit näyttää kirjat kirjastossa
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library has no books.");
        } else {
            System.out.println("\nBooks in the Library:");
            for (Book book : books) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    // Methodi kirjan lainaukselle
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println("You have borrowed: " + title);
                return;
            }
        }
        System.out.println("Sorry, the book '" + title + "' is not available.");
    }

    // Methodi kirjan palautukselle
    public void returnBook(Book book) {
        books.add(book);
        System.out.println("Book returned: " + book.getTitle());
    }
}
