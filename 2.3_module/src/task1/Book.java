package task1;
public class Book {
    private String title;
    private String author;
    private int publicationYear;

    // Constructori
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Getters eli hakumethodeja
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // Methodi näyttää kirjat in details
    public void displayBookInfo() {
        System.out.println(title + " by " + author + " (Published: " + publicationYear + ")");
    }

    public int getRating() {
        throw new UnsupportedOperationException("Unimplemented method 'getRating'");
    }

    public int getReviewCount() {
        throw new UnsupportedOperationException("Unimplemented method 'getReviewCount'");
    }

    public void setRating(double d) {
        throw new UnsupportedOperationException("Unimplemented method 'setRating'");
    }

    public void addReview(String string) {
        throw new UnsupportedOperationException("Unimplemented method 'addReview'");
    }
}
