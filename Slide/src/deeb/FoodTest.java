package deeb;

class FoodTest {

	public static void main(String[] args) {
		Food obj1 = new Food("juice" , 200 , 20);
		Food obj2 = new Food();
		obj1.displayInfo();
		obj2.readData();
		obj2.displayInfo();
	    System.out.println(Food.foodCount);
		
		
		
	}

}
