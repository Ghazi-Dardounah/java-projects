package LabiOne;
import java.util.Scanner;
public class ContactTest {

	public static void main(String[] args) {
		Scanner contact = new Scanner(System.in);
		System.out.println("Number of created contacts at the start of the program: "+Contact.getCount());
		Contact a1 = new Contact("Sara","0551122","sara@gmail.com","Riyadh");
		Contact a2 = new Contact("Norah","0553344","norah@gmail.com","Jeddah");
		System.out.println(a1);
		System.out.println(a2);
		System.out.print("Enter new email address for Sara: ");
		a1.setEmail(contact.next());
		System.out.println(a1);
		System.out.println("Number of created contacts at the end of the program: "+Contact.getCount());
		
		


	}

}
