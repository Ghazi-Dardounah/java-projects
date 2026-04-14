package lab6;

public class TestClass {

	public static void main(String[] args) {
		Animal[] AnimalList = new Animal[3];
		AnimalList[0] = new Dog("Dog_1", 20, 9, 999);
		AnimalList[1] = new Camel("Camel_1", 300, 12);
		AnimalList[2] = new Camel("Camel_2", 500, 12);
		for (int i = 0; i < AnimalList.length; i++) {
			Mammal m = (Mammal) AnimalList[i];
			System.out.println(AnimalList[i].getName() + " Has long gestation Period? "+m.isLongGestation());
		}
		for (int i = 0; i < AnimalList.length; i++) {
			AnimalList[i].sound();
		}
		for (int i = 0; i < AnimalList.length; i++) {
			System.out.println(AnimalList[i]);
		}

	}

}
