package task1;
public class LibraryMain {
    public static void main(String[] args) {
        // Luo Library
        Library library = new Library();

        // Luo kirjat
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("Animal Farm", "George Orwell", 1945);
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book5 = new Book("Brave New World", "Aldous Huxley", 1932);

        // Lisää kirjat kirjastoon prkl
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        // Display Kirjat
        library.displayBooks();

        // Etsi tietty kirja tietty kirjailija
        library.findBooksByAuthor("George Orwell");
        library.findBooksByAuthor("J.K. Rowling"); // Should return "No books found"

        

        
    }
}


