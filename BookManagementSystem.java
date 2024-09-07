import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Is Available (true/false): ");
                    boolean available = scanner.nextBoolean();
                    scanner.nextLine(); // Consume newline
                    library.addBook(new Book(id, title, author, available));
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Book ID to Remove: ");
                    int removeID = scanner.nextInt();
                    if (library.removeBook(removeID)) {
                        System.out.println("Book removed successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Search: ");
                    int searchID = scanner.nextInt();
                    Book book = library.searchBook(searchID);
                    if (book != null) {
                        System.out.println("Book found: " + book);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.println("Displaying all books:");
                    library.displayBooks();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;


            }
        }
    }

}
