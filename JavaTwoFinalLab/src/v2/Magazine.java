package v2;

public class Magazine extends LibraryItem {
	private int issue;
	private boolean monthly;

	public Magazine(String title, String author, int dueDays, int issue, boolean monthly) {
		super(title, author, dueDays);
		this.issue = issue;
		this.monthly = monthly;
	}

	public void borrow() {
		System.out.println("Borrowed magazine: " + title + " issue #" + issue);
	}

	public double calculateLateFee() {
		return dueDays * 0.2;
	}

	public String toString() {
		return "Magazine: " + title + " issue #" + issue + " (" + dueDays + " days)";
	}

}
