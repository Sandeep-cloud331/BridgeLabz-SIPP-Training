import java.util.ArrayList;
import java.util.List;

// Book class (can exist independently of a Library)
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class (aggregates Book objects)
class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    // Aggregation: adding existing book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    public void displayLibrary() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.displayBook();
        }
    }
}

// Main class to demonstrate aggregation
public class AggregationDemo {
    public static void main(String[] args) {
        // Independent books
        Book b1 = new Book("Effective Java", "Josh");
        Book b2 = new Book("Coding", "Robert");

        // Two libraries
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("University Library");

        // Aggregating books to libraries
        lib1.addBook(b1);
        lib2.addBook(b1); // same book added to another library
        lib2.addBook(b2);

        lib1.displayLibrary();
        lib2.displayLibrary();
    }
}
