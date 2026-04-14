package lab4;

public class Shape {
	protected String color;
	protected double area;
	
	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	public String toString() {
		return "Color: "+getColor()+"\n";
	}

}
