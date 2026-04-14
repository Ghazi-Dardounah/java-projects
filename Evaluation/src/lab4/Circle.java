package lab4;

public class Circle extends Shape {
	private double radius;
	
	public Circle(String color,double radius) {
		super(color);
		this.radius = radius;
	}
	public double CalculateArea() {
		area= 3.14 * Math.pow(radius, 2);
		return area;
	}
	public String toString() {
		return super.toString() + "Radius: "+getRadius()+"\nArea of the circle: "+CalculateArea();
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

}
