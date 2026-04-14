package lab6;

public abstract class Animal {
	private String name;
	protected double weight;
	
	public Animal(String name,double we) {
		this.name = name;
		weight = we;
	}
	public abstract void sound();
	public String toString() {
		return "Animal name :" + name+"\nAnnimal weight: "+weight+"\n";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
class Mammal extends Animal{
	private int gestationPeriod;
	
	public Mammal(String n,double w,int g) {
		super(n,w);
		gestationPeriod = g;
	}
	public void sound() {};
	public boolean isLongGestation() {
		if(gestationPeriod > 9){
			return true;
		}
		return false;
	}
	public String toString() {
		return super.toString() + "gestationPeriod: "+gestationPeriod;
	}
	public int getGestationPeriod() {
		return gestationPeriod;
	}
	public void setGestationPeriod(int gestationPeriod) {
		this.gestationPeriod = gestationPeriod;
	}
	
}
class Camel extends Mammal{
	public Camel(String n,double w,int g) {
		super(n,w,g);
	}
	public void sound() {
		System.out.println("Camel sound: oooaaa!");
	}
	public String toString() {
		return super.toString();
	}
}
class Dog extends Mammal{
	private int licenseNumber;
	
	public Dog(String n,double w,int g,int licenseNumber) {
		super(n,w,g);
		this.licenseNumber = licenseNumber;
	}
	public void sound() {
		System.out.println("Dog sound: Bark!");
	}
	public int getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String toString() {
		return super.toString() + "\nlicenseNumber: "+ licenseNumber;
	}
}


