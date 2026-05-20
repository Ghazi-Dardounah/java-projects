package v2;

public abstract class LibraryItem implements Borrowable {
	protected String title;
	protected String author;
	protected int dueDays;
	public LibraryItem(String title, String author, int dueDays) {
		this.title = title;
		this.author = author;
		this.dueDays = dueDays;
	}
	public int getDueDays() {
		return dueDays;
	}
	public abstract double calculateLateFee();
	public boolean equals(LibraryItem other) {
		if(this.title.equals(other.title) && this.author.equals(other.author))
			return true;
		return false;
	}
	public String toString() {
		return title + " by " + author + " (" + dueDays + " days)";
	}
	

}
