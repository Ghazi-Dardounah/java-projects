package bassam;

import java.util.Scanner;

class TestBook {

	public static void main(String[] args) {
		Scanner book = new Scanner(System.in);
		Book b1 = new Book("Dune", "Frank Herbert", 412, 45, 4.8);
		Book b2 = new Book();
		System.out.print("Enter title: ");
		String title = book.nextLine();
		b2.setTitle(title);
		System.out.print("Enter author: ");
		String author = book.nextLine();
		b2.setAuthor(author);
		System.out.print("Enter pages: ");
		int pages = book.nextInt();
		b2.setPages(pages);
		System.out.print("Enter price: ");
		double price = book.nextDouble();
		b2.setPrice(price);
		System.out.print("Enter rating: ");
		double rate = book.nextDouble();
		b2.setRating(rate);
		System.out.print("\n");
		b1.display();
		b2.display();
		System.out.println("Are the books equal? " + b1.equals(b2));
		System.out.println("is " + b1.getTitle() + " long? " + b1.isLong());
		System.out.println("is " + b2.getTitle() + " long? " + b2.isLong());
		System.out.println("the price after discount of " + b1.getTitle() + " is " + b1.discountPrice(15));
		System.out.println("the number of books: " + Book.getCountBooks());
		book.close();

	}

}
