package constructor;

public class LibraryBookSystem {
    String title;
    String author;
    double price;
    boolean isAvailable;

    // Constructor
    public LibraryBookSystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is not available.");
        }
    }

    public void displayInfo() {
        System.out.println(title + " by " + author + " | Price: ₹" + price + " | Available: " + isAvailable);
    }
}