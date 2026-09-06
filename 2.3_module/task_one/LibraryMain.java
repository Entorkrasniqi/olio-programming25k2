public class LibraryMain {
    public static void main(String[] args) {
        Library viikkLibrary;
        Book great;
        Book geti;

        viikkLibrary = new Library();
        great = new Book("Entor", "The Great", 1999);
        geti = new Book("Getoar", "The titsu", 2002);
        viikkLibrary.addBook(great);
        viikkLibrary.addBook(geti);
        viikkLibrary.displayBooks();
        }
    
}
