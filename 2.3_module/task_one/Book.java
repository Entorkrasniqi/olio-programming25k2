public class Book {
    private String author;
    private String title;
    private int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }
    public String getBook() {
        return author + " " + title + " " + year;
    }

    public String getAuthor() {
        return author;
    }

 
    
}
