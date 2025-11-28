package you;
import java.util.Scanner;

/*
* ID 446100902  MANSOUR
* ID 446106513  MUSTAFA Leader
* ID 446109621  GHAZI
*/

public class LibrarySimulator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Member member = new Member(1, "Student", 0);

        int choice = 0;

        while (choice != 6)
        {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. View Borrowed Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Statistics");
            System.out.println("5. Reset Statistics");
            System.out.println("6. Exit");

            System.out.print("Choose: ");
            choice = input.nextInt();

            switch (choice)
            {
                case 1:
                    member.viewBorrowedCount();
                    break;

                case 2:
                    member.borrowOne();
                    break;

                case 3:
                    member.returnOne();
                    break;

                case 4:
                    member.displayStatistics();
                    break;

                case 5:
                    member.reset();
                    System.out.println("Statistics reset.");
                    break;

                case 6:
                    System.out.println("\n--- Library Totals ---");
                    System.out.println("Total Revenue: " + Member.TotalRevenue);
                    System.out.println("Total Borrows: " + Member.TotalBorrows);
                    System.out.println("Total Returns: " + Member.TotalReturns);
                    System.out.println("Total Views: " + Member.TotalViewBorrowed);
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}
