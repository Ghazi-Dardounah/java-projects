package ghazi;

class SWICHH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 7;
		for (int i = 1; i <= size; i++)
		{
		    for (int j = 1; j <= size; j++)
		    {
		        if (i == 1 || i == size || j == 1 || j == size)
		        {
		            System.out.print("*");
		        }
		        else if (i == size / 2 + 1)
		        {
		            System.out.print("*");
		        }
		        else
		        {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}


	}

}
