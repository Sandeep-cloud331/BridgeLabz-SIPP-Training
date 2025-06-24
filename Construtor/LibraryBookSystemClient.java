package constructor;

public class LibraryBookSystemClient {
	public static void main(String[] args) {
        LibraryBookSystem book1 = new LibraryBookSystem("The Alchemist", "Paulo Coelho", 299);
        LibraryBookSystem book2 = new LibraryBookSystem("Wings of Fire", "A.P.J. Abdul Kalam", 350);

        book1.displayInfo();
        book1.borrowBook();
        book1.borrowBook(); // Trying to borrow again

        book2.displayInfo();
        book2.borrowBook();
    }
}