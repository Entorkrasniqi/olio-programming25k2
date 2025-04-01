public class Book {
    private String title;
    private String author;
    private int publicationYear;

    // Constructorit
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Getterit
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRating'");
    }

    public int getReviewCount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getReviewCount'");
    }

    public void setRating(double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setRating'");
    }

    public void addReview(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addReview'");
    }
}
