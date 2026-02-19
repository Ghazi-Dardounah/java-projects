package labfour;

public class CounterTest {

	public static void main(String[] args) {
		Counter c = new Counter(0);
		AdvancedCounter c2 = new AdvancedCounter(0, 2);
		LimitedCounter c3 = new LimitedCounter(0, 3);
		System.out.println(c);
		System.out.println(c3);
		System.out.println(c2);
		System.out.println("---------------------------------------");
		c.increment();
		System.out.println(c);
		System.out.println("---------------------------------------");
		c3.increment();
		c3.increment();
		c3.increment();
		c3.increment();
		System.out.println(c3);
		c3.reset();
		System.out.println(c3);
		System.out.println("---------------------------------------");
		c2.increment();
		c2.increment();
		System.out.println(c2);

	}

}
