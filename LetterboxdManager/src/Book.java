public class Book extends MediaItem {

	private String author;
	private int pages;
	
	public Book(String title, int year, String author, int pages) {
		super(title, year);
		this.author = author;
		this.pages = pages;
	}
	

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}

	@Override
	public void displayInfo() {
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + author);
		System.out.println("Year: " + getYear());
		System.out.println("Pages: " + pages);
		System.out.println("Rating: " + getRating());
		System.out.println("Completed: " + isCompleted());
		System.out.println();
	}
}
