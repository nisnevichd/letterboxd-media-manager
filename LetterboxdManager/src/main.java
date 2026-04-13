
public class main {

	public static void main(String[] args) {
		MediaItem m1 = new Movie("La La Land", 2015, "Chizelle", 158);
		m1.markCompleted();
		m1.setRating(5);
		m1.setReview("I wish I could watch this movie for the first time again");
		
		MediaItem m2 = new Movie("The Drama", 2026, "Borgli", 146);
		m2.markCompleted();
		m2.setRating(5);
		m2.setReview("The Dj is my favorite character");
		
		MediaItem b1 = new Book("The Secret History", 1992, "Tartt", 559);
		MediaItem b2 = new Book("The Brothers Karamazov", 1880, "Dostoevsky", 1056);
		
		m1.displayInfo();
		m2.displayInfo();
		b1.displayInfo();
		b2.displayInfo();


		
		
	}
}
