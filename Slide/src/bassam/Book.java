package bassam;

class Book {
	private String title;
	private String author;
	private int pages;
	private double price;
	private double rating;
	private static int countBooks;

	public Book() {
		title = "";
		author = "UNKNOWN";
		pages = 20;
		price = 10;
		rating = 0;
		countBooks++;
	}

	public Book(String title, String author, int pages, double price, double rating) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.price = price;
		this.rating = rating;
		countBooks++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		if (pages >= 20) {
			this.pages = pages;
		} else {
			this.pages = 20;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 10) {
			this.price = price;
		} else {
			this.price = 10;
		}
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		if (rating >= 0 && rating <= 5) {
			this.rating = rating;
		} else {
			this.rating = 0;
		}
	}

	public static int getCountBooks() {
		return countBooks;
	}

	public boolean isLong() {
		return pages >= 300;
	}

	public double discountPrice(double percent) {
		double priceAfterDis;
		if (percent >= 0) {
			priceAfterDis = this.price * (1 - percent / 100);
		} else {
			priceAfterDis = this.price;
		}
		return priceAfterDis;
	}

	public boolean equals(Book other) {
		return this.title.equals(other.title) && this.author.equals(other.author) && this.pages == other.pages
				&& this.price == other.price && this.rating == other.rating;
	}

	public void display() {
		System.out.println(this.getTitle() + " by " + this.getAuthor() + ", " + this.getPages() + ", " + this.getPrice()
				+ " SAR, " + this.getRating() + ": R");
	}

}
