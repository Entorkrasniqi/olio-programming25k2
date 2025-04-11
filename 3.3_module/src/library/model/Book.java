package library.model;

public class Book {
    private String title;
    private String author;
    private boolean reserved = false;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getteri ja Setteri methodit
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + "', author='" + author + "', reserved=" + reserved + '}';
    }
}
