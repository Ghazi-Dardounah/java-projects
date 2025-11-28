package LibrarySimulator;

/*
 * Authors : Mustafa, Ghazi, Mansour
 *
 */
import java.util.Scanner;

/**
 * main - program that simulate library system
 *
 *
 *
 */
public class LibrarySimulator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String front;

		// ID 446100902 1 MANSOUR
		// ID 446106513 2 MUSTAFA Leader
		// ID 446109621 3 GHAZI

		// Borrowed Books (will reset)
		int Books_Borrow_ID_1 = 0;
		int Books_Borrow_ID_2 = 0;
		int Books_Borrow_ID_3 = 0;

		// Returned Books (will reset)
		int Books_Return_ID_1 = 0;
		int Books_Return_ID_2 = 0;
		int Books_Return_ID_3 = 0;

		// Total Fees (will reset)
		double Total_Fee_ID_1 = Books_Borrow_ID_1 * 0.50;
		double Total_Fee_ID_2 = Books_Borrow_ID_2 * 0.50;
		double Total_Fee_ID_3 = Books_Borrow_ID_3 * 0.50;

		// Borrowed Books (for the admin)
		int Books_Borrow_1 = 0, Books_Borrow_2 = 0, Books_Borrow_3 = 0;
		// Returned Books (for the admin)
		int Books_Return_1 = 0, Books_Return_2 = 0, Books_Return_3 = 0;
		// Total Fees (for the admin)
		double Total_Fee_1 = Books_Borrow_1 * 0.50;
		double Total_Fee_2 = Books_Borrow_2 * 0.50;
		double Total_Fee_3 = Books_Borrow_3 * 0.50;

		while (true) {
			/* main loop */

			System.out.println("----------------------");
			System.out.println("Welcome to the library");
			System.out.println("----------------------");
			System.out.println("1. Enter Users selection");
			System.out.println("2. Login as Administrator");
			System.out.println("3. Exit the program \n");
			System.out.println("Note: navigate by numbers");

			front = input.nextLine().toLowerCase();

			if (front.equals("3")) {
				break;
			}

			switch (front) {
			/*------------------------------user panel-------------------------------------------------------------- */
			case ("1") -> {
				while (true) {
					System.out.println("Type user ID: ");
					System.out.println("1. 446100902 (Mansour)");
					System.out.println("2. 446106513 (Mustafa)");
					System.out.println("3. 446109621 (Ghazi)");
					System.out.print("4. back to main menu");

					String user = input.nextLine().trim();

					if (user.equalsIgnoreCase("4")) {
						System.out.println("Exiting from user menu \n");
						break; // exit from user loop
					}

					switch (user) {
					case "1" -> {
						while (true) {
							/*-------------------------------------------------Mansour----------------------------------------------------------- */
							System.out.println("-------");
							System.out.println("Mansour");
							System.out.println("-------");
							System.out.println("1. View borrowed books count");
							System.out.println("2. Borrow book");
							System.out.println("3. Return Book");
							System.out.println("4. View session summary");
							System.out.println("5. back to user menu");

							String userMenu = input.nextLine().toLowerCase();

							if (userMenu.equals("5")) {
								break;
							}

							switch (userMenu) {
							case "1" -> {
								if (Books_Borrow_ID_1 == 0) {
									System.out.println("You did not borrow yet");
								} else {
									System.out.println("The number of books you borrowed is = " + Books_Borrow_ID_1);
								}
							}

							case "2" -> {
								System.out.print("Number of books you want to borrow: ");
								int borrow = input.nextInt();
								input.nextLine();

								if (borrow <= 5 && borrow > 0) {
									Books_Borrow_ID_1 += borrow;
									Total_Fee_ID_1 = Books_Borrow_ID_1 * 0.50;

									Total_Fee_1 = Total_Fee_ID_1;
									Books_Borrow_1 = Books_Borrow_ID_1;
								} else {
									System.out.println("Can not Borrow That Amount");
								}
							}

							case "3" -> {
								System.out.print("How many books you want to return? ");
								int returned = input.nextInt();
								input.nextLine();

								if (returned == 0) {
									System.out.println("you can't return that amount");
								} else if (Books_Borrow_ID_1 >= returned) {
									Books_Borrow_ID_1 -= returned;
									Books_Return_ID_1 += returned;

									Books_Borrow_1 = Books_Borrow_ID_1;
									Books_Return_1 = Books_Return_ID_1;
								} else {
									System.out.println("Books returned are more than books borrowed");
								}
							}

							case "4" -> {
								System.out.println("Number of books borrowed is " + Books_Borrow_ID_1);
								System.out.println("Number of books returned is " + Books_Return_ID_1);
								System.out.println("Your total fees are " + Total_Fee_ID_1);
							}

							default -> System.out.println("Invalid option in user menu!.");
							}// end userMenu switch
						} // end Mansour loop
					} // end Mansour case

					case "2" -> {
						/*-------------------------------------------------Mustafa----------------------------------------------------------- */
						while (true) {
							System.out.println("-------");
							System.out.println("Mustafa");
							System.out.println("-------");
							System.out.println("1. View borrowed books count");
							System.out.println("2. Borrow book");
							System.out.println("3. Return Book");
							System.out.println("4. View session summary");
							System.out.println("5. back to user menu");

							String userMenu = input.nextLine().toLowerCase();

							if (userMenu.equals("5")) {
								break;
							}

							switch (userMenu) {
							case "1" -> {
								if (Books_Borrow_ID_2 == 0) {
									System.out.println("You did not borrow yet");
								} else {
									System.out.println("The number of books you borrowed is = " + Books_Borrow_ID_2);
								}
							}

							case "2" -> {
								System.out.print("Number of books you want to borrow: ");
								int borrow = input.nextInt();
								input.nextLine();

								if (borrow <= 5 && borrow > 0) {
									Books_Borrow_ID_2 += borrow;
									Total_Fee_ID_2 = Books_Borrow_ID_2 * 0.50;

									Total_Fee_2 = Total_Fee_ID_2;
									Books_Borrow_2 = Books_Borrow_ID_2;
								} else {
									System.out.println("Can not Borrow That Amount");
								}
							}

							case "3" -> {
								System.out.print("How many books you want to return? ");
								int returned = input.nextInt();
								input.nextLine();

								if (returned == 0) {
									System.out.println("you can't return that amount");
								} else if (Books_Borrow_ID_2 >= returned) {
									Books_Borrow_ID_2 -= returned;
									Books_Return_ID_2 += returned;

									Books_Borrow_2 = Books_Borrow_ID_2;
									Books_Return_2 = Books_Return_ID_2;
								} else {
									System.out.println("Books returned are more than books borrowed");
								}
							}

							case "4" -> {
								System.out.println("Number of books borrowed is " + Books_Borrow_ID_2);
								System.out.println("Number of books returned is " + Books_Return_ID_2);
								System.out.println("Your total fees are " + Total_Fee_ID_2);
							}

							default -> System.out.println("Invalid option in user menu.");
							} // end userMenu switch
						} // end Mustafa loop
					} // end Mustafa case

					case "3" -> {
						while (true) {
							/*-------------------------------------------------Ghazi----------------------------------------------------------- */
							System.out.println("-----");
							System.out.println("Ghazi");
							System.out.println("-----");
							System.out.println("1. View borrowed books count");
							System.out.println("2. Borrow book");
							System.out.println("3. Return Book");
							System.out.println("4. View session summary");
							System.out.println("5. back to user menu");

							String userMenu = input.nextLine().toLowerCase();

							if (userMenu.equals("5")) {
								break;
							}

							switch (userMenu) {
							case "1" -> {
								if (Books_Borrow_ID_3 == 0) {
									System.out.println("You did not borrow yet");
								} else {
									System.out.println("The number of books you borrowed is = " + Books_Borrow_ID_3);
								}
							}

							case "2" -> {
								System.out.print("Number of books you want to borrow: ");
								int borrow = input.nextInt();
								input.nextLine();

								if (borrow <= 5 && borrow > 0) {
									Books_Borrow_ID_3 += borrow;
									Total_Fee_ID_3 = Books_Borrow_ID_3 * 0.50;

									Total_Fee_3 = Total_Fee_ID_3;
									Books_Borrow_3 = Books_Borrow_ID_3;
								} else {
									System.out.println("Can not Borrow That Amount");
								}
							}

							case "3" -> {
								System.out.print("How many books you want to return? ");
								int returned = input.nextInt();
								input.nextLine();

								if (returned == 0) {
									System.out.println("you can't return that amount");
								} else if (Books_Borrow_ID_3 >= returned) {
									Books_Borrow_ID_3 -= returned;
									Books_Return_ID_3 += returned;

									Books_Borrow_3 = Books_Borrow_ID_3;
									Books_Return_3 = Books_Return_ID_3;
								} else {
									System.out.println("Books returned are more than books borrowed");
								}
							}

							case "4" -> {
								System.out.println("Number of books borrowed is " + Books_Borrow_ID_3);
								System.out.println("Number of books returned is " + Books_Return_ID_3);
								System.out.println("Your total fees are " + Total_Fee_ID_3);
							}

							default -> System.out.println("Invalid option in user menu.");
							} // end userMenu switch
						} // end ghazi loop
					} // end Ghazi case

					default -> System.out.println("please enter a valid user.");
					} // end switch(user)
				} // end while(true)

				// reset those variables
				Books_Return_ID_1 = 0;
				Books_Return_ID_2 = 0;
				Books_Return_ID_3 = 0;
				Books_Borrow_ID_1 = 0;
				Books_Borrow_ID_2 = 0;
				Books_Borrow_ID_3 = 0;
				Total_Fee_ID_1 = 0;
				Total_Fee_ID_2 = 0;
				Total_Fee_ID_3 = 0;
			}
			/*------------------------------admin panel-------------------------------------------------------------- */
			case ("2") -> {
				String adminPassword = "1234567"; // admin password
				System.out.print("Enter admin password: ");
				String Password = input.nextLine();

				if (!Password.equals(adminPassword)) {
					System.out.println("Incorrect password. Returning to main menu.");
					break;
				}

				String AdminMinu;
				do {
					System.out.println("---------------------");
					System.out.println("welcom to admin panel");
					System.out.println("---------------------");
					System.out.println("1. show total revenue");
					System.out.println("2. show most frequent operation");
					System.out.println("3. exit ");

					AdminMinu = input.nextLine().toLowerCase();

					switch (AdminMinu) {
					case "1" -> {
						double totalRevenue = Total_Fee_1 + Total_Fee_2 + Total_Fee_3;
						System.out.printf("Total revenue: %.2f SAR\n", totalRevenue);

					}

					case "2" -> {
						int totalBorrowed = Books_Borrow_1 + Books_Borrow_2 + Books_Borrow_3;
						int totalReturned = Books_Return_1 + Books_Return_2 + Books_Return_3;

						if (totalBorrowed > totalReturned) {
							System.out.println("Borrowing is the most frequent operation.");
						} else if (totalReturned > totalBorrowed) {
							System.out.println("Returning is the most frequent operation.");
						} else {
							System.out.println("Borrowing and returning are equally frequent.");
						}
					}

					case "3" -> {
						System.out.println("Exiting admin menu...");
					}

					default -> {
						System.out.println("Invalid option.");
					}
					}
				} while (!AdminMinu.equals("3"));

			}

			}
		}

	}

}
