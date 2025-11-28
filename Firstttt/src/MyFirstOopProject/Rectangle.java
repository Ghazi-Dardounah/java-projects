package MyFirstOopProject;

public class Rectangle {
	private double width;
	private double length;
	private double area;
	
	
	public void setwidth(double w) {
		width = w ; 
	}
	public void setlength(double l) {
		length = l ; 
	}
	public double getwidth() {
		return width;
	}
	public double getlingth() {
		return length;
	}
	public double areaoutput() {
	 System.out.println("area = "+ width*length);
	 return area;
		
		
	}
	
	
	
}

	

