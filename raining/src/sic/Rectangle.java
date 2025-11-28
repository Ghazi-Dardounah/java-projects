package sic;
import java.util.Scanner;
class Rectangle {
	private int length;
	private int width;
	
	public Rectangle() {
		this.length =1;
		this.width =1;
	}
	public Rectangle(int l , int w) {
		if(w<=0) {
			this.width =1;
		}
		else {
			this.width = w;
		}
		if(l<=0) {
			this.length =1;
		}
		else {
			this.length = l;
		}
	}
	public void setLength(int l) {
		if (l<=0) {
			System.out.println("Length can not be negative!");
			System.exit(0);
		}
		else {
			this.length = l;
		}
	}
	public void setWidth(int w) {
		if(w<=0) {
			System.out.println("Width can not be negative!");
			System.exit(0);
		}
		else {
			this.width = w;
		}
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public double calcArea() {
		return width*length;
	}
	public double calcPerimeter() {
		return 2*(length + width);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter the length: ");
		rectangle.setLength(input.nextInt());
		System.out.println("Enter the width: ");
		rectangle.setWidth(input.nextInt());
		System.out.println("length: "+ rectangle.getLength());
		System.out.println("width: "+ rectangle.getWidth());
		System.out.println("Area: "+rectangle.calcArea());
		System.out.println("Perimeter: "+rectangle.calcPerimeter());
	}

}
