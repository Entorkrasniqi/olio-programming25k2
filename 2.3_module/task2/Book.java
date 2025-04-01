import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double rating;
    private ArrayList<String> reviews;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.rating = 0;  
        this.reviews = new ArrayList<>();
    }

    // Getterit kirja infoa varten
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public double getRating() {
        return rating;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    // Näyttö kirja infoa varten
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Rating: " + rating);
        if (!reviews.isEmpty()) {
            System.out.println("Reviews:");
            for (String review : reviews) {
                System.out.println("  - " + review);
            }
        } else {
            System.out.println("No reviews yet.");
        }
    }

    // Kirja ratingit
    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Rating must be between 0 and 5.");
        }
    }

    // Review lisäys kohta
    public void addReview(String review) {
        reviews.add(review);
    }
}
