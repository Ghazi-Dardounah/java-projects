package v2;

public class Book extends LibraryItem {
	private int pages;
	private boolean hardcover;

	public Book(String title, String author, int dueDays, int pages, boolean hardcover) {
		super(title, author, dueDays);
		this.pages = pages;
		this.hardcover = hardcover;
	}

	public void borrow() {
		System.out.println("Borrowed book: " + title + " by " + author + " (" + pages + " pages)");
	}

	public double calculateLateFee() {
		if (hardcover)
			return dueDays * 1.50;
		return dueDays * 0.50;
	}

	public String toString() {
		return "Book: "+title + " by " + author + " [" + pages + " pages]" + " (" + dueDays + " days)";
	}

}
