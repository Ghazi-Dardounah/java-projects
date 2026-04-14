package labn6;
public class Test {
	public static void main(String[] args) {
		int count = 0;

		PainKiller[] painKillerList = new PainKiller[3];

		painKillerList[0] = new Panadol(40, 3, 9);
		painKillerList[1] = new Panadol(60, 1, 22);
		painKillerList[2] = new Panadol(20, 4, 10);
		for (int i = 0; i < painKillerList.length; i++) {
			if (((Panadol) painKillerList[i]).isExpired(12)) {
				System.out.println("This panadol is expired ");
				((Panadol) painKillerList[i]).display();
				System.out.println();
				count++;
			}
		}
		System.out.println();
		System.out.println("Number of expired panadols: " + count);
		System.out.println();
		double dose;
		for (int i = 0; i < painKillerList.length; i++) {
			dose = ((Panadol) painKillerList[i]).calculateDose(64, 7);
			System.out.println(
					"Panadol with strength: " + ((Panadol) painKillerList[i]).getStrength() + " dose is: " + dose);
		}

	}
}
