public class Book {
    // Initializing attributes
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;
    // Constructors for the attributes
    public Book(int bookID, String title, String author, boolean isAvailable) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    // Getters and Setters for the attributes
    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "BookID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }

}
