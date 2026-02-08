package tut2;

public class Item {
	private String name;
	private double price;
	private String ID;
	
	public Item(String name, double price, String iD) {
		this.name = name;
		this.price = price;
		ID = iD;
	}
	public String getID() {
		return ID;
	}
	public double getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}

}
