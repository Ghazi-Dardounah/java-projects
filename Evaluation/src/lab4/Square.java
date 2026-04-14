package lab4;

public class Square extends Shape {
	private double side;
	
	public Square(String color,double side) {
		super(color);
		this.side = side;
	}
	public double CalculateArea() {
	    area =side*side;
	    return area;
	}
	public String toString() {
		return super.toString() + "Side: "+getSide()+ "\n"+"Area of the square: "+CalculateArea()+"\n";
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}

}
