package labTwo2026;

public class Item {
	private int id;
	private String name;
	private double price;

	public Item(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price > 0 ) {
			this.price = price;
		}
		else {
			this.price = 100;
		}
	}
	public String toString() {
		return "Item ID: "+id+", Name: "+name+", Price: "+this.getPrice()+"SAR";
	}

}
