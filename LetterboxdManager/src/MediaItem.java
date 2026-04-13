
public abstract class MediaItem {

	
	private String title;
	private int year;
	private boolean completed;
	private int rating;
	private String review;
	
	//constructor
	public MediaItem(String title, int year) {
		this.title = title;
		this.year = year;
		this.completed = false;
		this.rating = 0;
		this.review = "";
	}

	//getters
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @return the completed
	 */
	public boolean isCompleted() {
		return completed;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @return the review
	 */
	public String getReview() {
		return review;
	}
	
	//methods
	public void markCompleted() {
		this.completed = true;
	}
	
	public void markIncomplete() {
		this.completed = false;
	}
	
	public void setRating(int rating) {
		if (rating >= 0 && rating <= 5) {
			this.rating = rating;
		}
	}
	
	public void setReview(String review) {
		this.review = review;
	}
	
	//abstract method
	public abstract void displayInfo();
}
