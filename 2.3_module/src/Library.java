import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Library Methodi lisätä kirja, kirjasto methodiin
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Methodi näyttää kirjastos olevat kaikki kirjat
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library has no books.");
        } else {
            System.out.println("Books in the Library:");
            for (Book book : books) {
                book.displayBookInfo();
            }
        }
    }

    // Method etsiä kirjat to specific kirjailijaan
    public void findBooksByAuthor(String author) {
        boolean found = false;
        System.out.println("\nBooks by " + author + ":");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                book.displayBookInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by this author.");
        }
    }
}
