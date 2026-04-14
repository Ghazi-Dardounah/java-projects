package labn6;

public class Panadol extends Medicine implements PainKiller{
	public Panadol(int str,int use,int expDate) {
		super(str,use,expDate);
	}
	public double calculateDose(int weight,int num) {
		return (double)(strength*usage*num)/weight;
	}
	public boolean isExpired(int today) {
		if(getExpirationDate()<today) {
			return true;
		}
		return false;
	}
	public void display() {
		System.out.println("Panadol\n");
		super.display();
	}
}
