package labTwo2026;

public class CartTest {

	public static void main(String[] args) {
		Cart arr = new Cart(20);
		Item it1 = new Item(1, "Water", 15.5);
		Item it2 = new Item(5, "Sugar", 19.95);
		Item it3 = new Item(8, "Rice", 40.0);
		arr.addItem(it1);
		arr.addItem(it2);
		arr.addItem(it3);
		//("--------------------Before modify--------------------");
		System.out.println(arr.toString());
		System.out.println("-----------------------------------------");
		System.out.println("Total: "+arr.getTotal()+"SAR");
		//("--------------------After modify--------------------");
		it3.setPrice(35.0);
		System.out.println(arr.toString());
		System.out.println("-----------------------------------------");
		System.out.println("Total: "+arr.getTotal()+"SAR");




	}

}
