package labfour;

public class LimitedCounter extends Counter {
	private int limit;
	 public LimitedCounter(int count,int limit) {
		 super(count);
		 this.limit = limit;
	 }
	 public void increment() {
		 if(count>=limit) {
			 System.out.println("Reached limit, cannot increment anymore.");
		 }
		 else {
			 count++;
		 }
	 }
	 public String toString() {
		 return super.toString() + " Type: Limited, Limit: "+limit;
	 }

}
