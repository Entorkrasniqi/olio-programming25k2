import library.model.Book;
import library.model.LibraryMember;
import library.system.Library;

public class Main {
    public static void main(String[] args) {
            // Luo uus library system
        Library library = new Library();

        // Luo Kirjat
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Add books to the library (you can extend the library class to handle this)
        // library.addBook(book1);
        // library.addBook(book2);
        // library.addBook(book3);

        // Luo library members
        LibraryMember member1 = new LibraryMember("Alice", 1);
        LibraryMember member2 = new LibraryMember("Bob", 2);

        // Varaa Kirjat
        library.reserveBook(member1, book1);
        library.reserveBook(member2, book2);
        library.reserveBook(member1, book3); // Alice tries to reserve another book

        // Display varatut kirjat Alice ja Bobille
        library.displayReservedBooks(member1);
        library.displayReservedBooks(member2);

        // Cancel reservation for Bob
        library.cancelReservation(member2, book2);

        // Display reserved books again for Bob
        library.displayReservedBooks(member2);
    }
}
