package tut2;

public class ShoppingCart {
	private Item itemList[];
	private int numOfItem;

	public ShoppingCart(int size) {
		itemList = new Item[size];
		numOfItem = 0;
	}

	public void AddItem(Item item) {
		if (numOfItem < itemList.length) {
			itemList[numOfItem++] = item;
		} else {
			System.out.println("The Shopping Cart Is Full!");
		}
	}

	public boolean RemoveItem(String id) {
		for (int i = 0; i < numOfItem; i++) {
			if (itemList[i] != null && itemList[i].getID().equals(id)) {
				for (int j = i; j < numOfItem - 1; j++) {
					itemList[j] = itemList[j + 1];
				}
				itemList[numOfItem - 1] = null;
				numOfItem--;
				return true;
			}
		}
		return false;
	}

	public double CalculateBill() {
		double totalPrice = 0;
		for (int i = 0; i < numOfItem; i++) {
			if (itemList[i] != null) {
				totalPrice += itemList[i].getPrice();
			}
		}
		return totalPrice;
	}

	public int CountItem(String name) {
		int count = 0;
		for (int i = 0; i < numOfItem; i++) {
			if (itemList[i] != null && itemList[i].getName().equals(name)) {
				count++;
			}
		}
		return count;
	}

	public Item[] SearshByItem(String name) {
		int count = 0;
		for (int i = 0; i < numOfItem; i++) {
			if (itemList[i] != null && itemList[i].getName().equals(name)) {
				count++;
			}
		}
		int index = 0;
		Item arr[] = new Item[count];
		for (int i = 0; i < numOfItem; i++) {
			if (itemList[i] != null && itemList[i].getName().equals(name)) {
				arr[index++] = itemList[i];
			}
		}
		return arr;
	}

}
