package you;
/*
* ID 446100902  MANSOUR
* ID 446106513  MUSTAFA Leader
* ID 446109621  GHAZI
*/

public class Member
{
    private int id;
    private String name;
    private int borrowedCount;
    private int numViewBorrowed;
    private int numBorrows;
    private int numReturns;
    private double sessionFees;

    public static double TotalRevenue = 0;
    public static int TotalViewBorrowed = 0;
    public static int TotalBorrows = 0;
    public static int TotalReturns = 0;

    // Constructor
    public Member(int id, String name, int borrowedCount)
    {
        this.id = id;
        this.name = name;
        this.borrowedCount = borrowedCount;
    }

    // Private helpers
    private boolean canBorrow()
    {
        return borrowedCount < 5;
    }

    private boolean canReturn()
    {
        return borrowedCount > 0;
    }

    // View borrowed books
    public void viewBorrowedCount()
    {
        System.out.println("Borrowed books: " + borrowedCount);
        numViewBorrowed++;
        TotalViewBorrowed++;
    }

    // Borrow one book
    public boolean borrowOne()
    {
        if (canBorrow())
        {
            System.out.println("you have Borrowed a book");
            borrowedCount++;
            numBorrows++;
            TotalBorrows++;
            sessionFees += 0.50;
            TotalRevenue += 0.50;
            return true;
        }
        else
        {
            System.out.println("Cannot borrow more than 5 books.");
            return false;
        }
    }

    // Return one book
    public boolean returnOne()
    {
        if (canReturn())
        {
            System.out.println("you have Return a book");
            borrowedCount--;
            numReturns++;
            TotalReturns++;
            return true;
        }
        else
        {
            System.out.println("No books to return.");
            return false;
        }
    }

    // Display statistics
    public void displayStatistics()
    {
        System.out.println("---- Member Statistics ----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Borrow operations: " + numBorrows);
        System.out.println("Return operations: " + numReturns);
        System.out.println("View operations: " + numViewBorrowed);
        System.out.println("Session fees: " + sessionFees);
    }

    // Reset statistics
    public void reset()
    {
        numBorrows = 0;
        numReturns = 0;
        numViewBorrowed = 0;
        sessionFees = 0;
    }
}
