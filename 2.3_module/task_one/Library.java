import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add methods here


    // Add addBook(Book book): method
    public void addBook(Book book){
        books.add(book);
    }
    // Add displayBooks() this method should display details of all the books in the library collection
    public void displayBooks(){
        System.out.println("Library: Catalog: ");
        for(int i = 0; i < books.size(); i++) {
            System.out.println((i+1) + ". " + "Title: " + books.get(i).getBook());
        }
    }

    // Add findBooksAuthor(String author) this method should search and display the details of books
    public void findBooksAuthor (String author) {
        for(int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(author)) {
                System.out.println(books.get(i).getBook());
            }
        }

    }
}