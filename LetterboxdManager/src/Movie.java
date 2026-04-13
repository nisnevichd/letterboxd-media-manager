
public class Movie extends MediaItem{

	private String director;
	private int duration;
	
	public Movie(String title, int year, String director, int duration) {
		super(title, year);
		this.director = director;
		this.duration = duration;
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	@Override
	public void displayInfo() {
		System.out.println("Title: " + getTitle());
		System.out.println("Director: " + director);
		System.out.println("Year: " + getYear());
		System.out.println("Duration: " + duration + " minutes");
		System.out.println("Rating: " + getRating());
		System.out.println("Completed: " + isCompleted());
		System.out.println();
	}
	
}
