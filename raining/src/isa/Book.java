package isa;
import java.util.Scanner;
class Book {
	private String title;
	private String author;
	private int totalCopies;
	private int availableCopies;
	
	public Book() {}
	public Book(String title , String author , int totalCopies) {
		this.title = title;
		this.author = author;
		this.totalCopies = totalCopies;
		this.availableCopies = totalCopies;
	}
	public void setTitle(String t) {
		this.title = t;
	}
	public void setAuthor(String a) {
		this.author = a;
	}
	public void setTotalCopies(int tc) {
		this.totalCopies = tc;
	}
	public void setavAilableCopies(int ac) {
		this.availableCopies = ac;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getTotalCopies() {
		return totalCopies;
	}
	public int getAvailableCopies() {
		return availableCopies;
	}
	public boolean borrow() {
		if(availableCopies > 0) {
			availableCopies--;
			System.out.println("borrow complete!");
			System.out.println("-------------------------------");
			return true;
		}
		else {
			System.out.println("No Available Copies!");
			System.out.println("-------------------------------");
			return false;
		}
	}
	public void returnBook() {
		if(availableCopies < totalCopies) {
			availableCopies++;
			System.out.println("return complete!!");
			System.out.println("-------------------------------");
		}
	    else if(availableCopies == totalCopies) {
			System.out.println("All copies are already in the library!");
			System.out.println("-------------------------------");
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the book's title: ");
		String title = input.nextLine();
		System.out.println("Enter the name of the author: ");
		String writer = input.nextLine();
		System.out.println("Enter the total copies: ");
		int Copies = input.nextInt();
		Book b = new Book(title , writer , Copies);
		while(true) {
		System.out.println("choose the operation:\n1)Borrow a copy\n2)Return a copy\n3)Show book info\n4)Exit");
		int choose = input.nextInt();
		switch(choose) {
		case 1:
			b.borrow();
			break;
		case 2:
			b.returnBook();
			break;
		case 3:
			System.out.println("The Title is: "+ b.getTitle());
			System.out.println("The author name is: "+ b.getAuthor());
			System.out.println("The number of total copies: "+b.getTotalCopies());
			System.out.println("The number of available copies: "+b.getAvailableCopies());
			System.out.println("-------------------------------");
			break;
		case 4:
			System.exit(0);
		}
		
		}
	}

}
