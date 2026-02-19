package labfour;

public class Counter {
	protected int count;
	
	public Counter(int count){
		this.count = count;		
	}
	public void increment() {
		count++;
	}
	public void reset() {
		count = 0;
	}
	public String toString() {
		return "Counter: ("+count+")";
	}

}
