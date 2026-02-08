package labTwo2026;

public class Cart {
	private Item items[];
	private int itemCount;
	
	public Cart(int size) {
		items = new Item[size];
		itemCount=0;
	}
	public boolean addItem(Item it) {
		if(itemCount < items.length) {
			items[itemCount] = it;
			itemCount++;
			return true;
		}
		return false;
	}
	public double getTotal() {
		double total = 0 ;
		for(int i =0 ; i < itemCount;i++) {
			total+=items[i].getPrice();
		}
		return total;
	}
	public String toString() {
		String result = "Cart ("+itemCount+"):\n";
		for(int i = 0 ; i<itemCount ;i++) {
			result += items[i].toString()+"\n";
		}
		return result;
	}

}
