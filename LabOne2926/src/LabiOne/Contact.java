package LabiOne;

public class Contact {
	private String name;
	private String number;
	private String email;
	private String address;
	private static int count;

	public Contact(String name, String number, String email, String address) {
		this.name = name;
		this.number = number;
		this.email = email;
		this.address = address;
		count++;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static int getCount() {
		return count;
	}

	public String toString() {
		return name + " | " + number + " | " + email + " | " + address;
	}

}
