import java.util.ArrayList;
import java.util.List;

public class Library {
    // Adding book to the array
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }
     // Adding book
    public void addBook(Book book) {
        books.add(book);
    }
    // Removing book
    public boolean removeBook(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }
    // Searching book
    public Book searchBook(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                return book;
            }
        }
        return null;
    }
    // Displaying book
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
