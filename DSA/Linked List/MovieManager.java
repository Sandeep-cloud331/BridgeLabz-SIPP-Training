class MovieNode{
	String title;
	int releaseYr;
	String director;
	double ratings;
	MovieNode next;
	MovieNode prev;
	
	MovieNode(String title,int releaseYr,String director,double ratings){
		this.title = title;
		this.releaseYr = releaseYr;
		this.director = director;
		this.ratings = ratings;
		this.next = null;
		this.prev = null;
	}
	
}

class MovieList{
	MovieNode head = null;
	MovieNode tail = null;
	int cnt=0;
	
	void addMovie(String title,int releaseYr,String director,double ratings){
		cnt++;
		MovieNode newMovie = new MovieNode(title,releaseYr,director,ratings);
		if(head == null){
			head = tail = newMovie;
			
		}else{
			MovieNode temp = tail;
			tail.next = newMovie;
			tail = tail.next;
			tail.prev = temp;
			
		}
	}
	void displayMovies(){
		MovieNode temp = head;
		System.out.println("List consist:"+cnt+" movies");
		while(temp != null){
			System.out.print(temp.title +",");
			temp=temp.next;
		}
	}
	
	void addMovieAtPosition(int position, MovieNode newMovie) {
		cnt++;
		if (position == 0) {
			// Insert at beginning
			newMovie.next = head;
			if (head != null) head.prev = newMovie;
			head = newMovie;
			if (tail == null) tail = newMovie;
			return;
		}

		MovieNode temp = head;
		int i = 0;

		// Traverse to (position - 1) node
		while (i < position - 1 && temp != null) {
			temp = temp.next;
			i++;
		}

		if (temp == null) {
			System.out.println("Invalid position: list is shorter than " + position);
			return;
		}

		if (temp.next == null) {
			// Insert at the end
			temp.next = newMovie;
			newMovie.prev = temp;
			tail = newMovie;
		} else {
			// Insert in the middle
			newMovie.next = temp.next;
			newMovie.prev = temp;
			temp.next.prev = newMovie;
			temp.next = newMovie;
		}
	}
}

class MovieManager{
	public static void main(String[] args){
		MovieList movie = new MovieList();
		MovieNode movie1 = new MovieNode("Inception", 2010, "Christopher Nolan", 8.8);
		movie.addMovie("The Shawshank Redemption", 1994, "Frank Darabont", 9.3);
		movie.addMovieAtPosition(0,movie1);
		movie.displayMovies();
		
		MovieNode temp = movie.head;
		
		while(temp.next !=null){
			temp= temp.next;
		}
		//System.out.print(temp.prev.title);
		
		
	}
}