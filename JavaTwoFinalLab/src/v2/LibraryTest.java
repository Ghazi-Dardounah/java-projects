package v2;

public class LibraryTest {

	public static void main(String[] args) {
		try {
			Library catching = new Library("l1",0);
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("----------------------------------------");
		Library l1 = new Library("Central",4);
		Book b1 = new Book("Gatsby","Scott",7,180,false);
		Book b2 = new Book("Java","Eckel",14,1000,true);
		Magazine m1 = new Magazine("NatGeo","NGS",3,247,true);
		Magazine m2 = new Magazine("Time","TI",5,1850,false);
		l1.add(b1);
		l1.add(b2);
		l1.add(m1);
		l1.add(m2);
		System.out.print(l1);
		System.out.println("----------------------------------------");
		l1.borrowAll();
		System.out.println("----------------------------------------");
		System.out.println("Most overdue: "+l1.getMostOverdue());
	}

}
