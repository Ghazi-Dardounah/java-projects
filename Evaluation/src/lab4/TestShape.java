package lab4;

public class TestShape {

	public static void main(String[] args) {
		Shape shape = new Shape("Yellow");
		Shape square = new Square("Red", 4);
		Shape circle = new Circle("Orange", 4);
		System.out.println(shape);
		System.out.println(square);
		System.out.println(circle);

	}

}
