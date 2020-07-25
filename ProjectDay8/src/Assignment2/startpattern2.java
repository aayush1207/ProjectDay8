package Assignment2;

public class startpattern2 {
	public static void main(String[] args) 
	{
		int i,j;
		for (i=1; i<=5; i++)
		{
			for(j=2*(5-i); j>=0; j--) 
            { 
                System.out.print(" "); 
            }
			for (j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	}


