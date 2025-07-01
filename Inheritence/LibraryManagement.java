class LibraryManagement{
	class Book{
		String title;
		int publishedYear;
		
		Book(String title , int publishedYear){
			this.title = title;
			this.publishedYear = publishedYear;
		}
		void displayInfo(){
			System.out.print(title + "published in " + publishedYear);
		}
	}
	class Author extends Book{
		String name;
		String bio;
		
		Author(String name,String bio,String title, int publishedYear){
			super(title,publishedYear);
			this.name = name;
			this.bio = bio;
		}
		
		@Override
		void displayInfo(){
			super.displayInfo();
			System.out.println("Author :"+ name);
			System.out.print("Bio :"+bio);
		}
		
	}
	public static void main(String[] args){
		LibraryManagement lm = new LibraryManagement();
		
		Author author1 = lm.new Author("Haruki Murakami","Award-winning Japanese novelist known for surreal fiction.","Nowerign wood", 2002);
		author1.displayInfo();
	}
}