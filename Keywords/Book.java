public class Book {
	static String libraryName = "XYZ Library";
	String title;
	String author;
	final boolean isbn;
	static void displayLibraryName() {
		System.out.println("Library name: "+libraryName);
	}
	Book(String title, String author, boolean isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	void displayBookDetails() {
		System.out.println(title + author + isbn);
	}
	public static void main(String[] args) {
		Book b1 = new Book("OS","AS",true);
		if(b1 instanceof Book) {
			b1.displayBookDetails();
		}
		Book.displayLibraryName();
		
	}

}