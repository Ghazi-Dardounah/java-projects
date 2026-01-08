package gptProject;

public class Bank {
	private static int totalAccounts;

	public static void incrementAccounts() {
		totalAccounts++;
	}

	public static int getTotalAccounts() {
		return totalAccounts;
	}

}
