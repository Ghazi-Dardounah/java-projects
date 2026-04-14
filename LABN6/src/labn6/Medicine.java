package labn6;

public abstract class Medicine {
	protected int strength;
	protected int usage;
	protected int expirationDate;
	public Medicine(int str,int use,int expDate) {
		strength = str;
		usage = use;
		expirationDate = expDate;
	}
	public abstract boolean isExpired(int today);
	public void display() {
		System.out.println("Medicine strength: "+strength+"\nMedicine usage: "+usage+"\nMedicine Expiration Date: "+expirationDate);
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getUsage() {
		return usage;
	}
	public void setUsage(int usage) {
		this.usage = usage;
	}
	public int getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(int expirationDate) {
		this.expirationDate = expirationDate;
	}
	

}
