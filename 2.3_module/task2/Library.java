import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Lisää kirja kirjastoon
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Näytä kaikki kirjat kirjastossa
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

    // Löydä tietty kirjuri
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

    // Kato onko kirja kirjastossa
    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    // Lainaus tittelillä
    public void borrowBook(String title) {
        if (isBookAvailable(title)) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    books.remove(book);
                    System.out.println("You have borrowed: " + book.getTitle());
                    return;
                }
            }
        } else {
            System.out.println("Sorry, the book '" + title + "' is not available.");
        }
    }

    // Palauta kirja
    public void returnBook(Book book) {
        books.add(book);
        System.out.println("Book returned: " + book.getTitle());
    }
}
