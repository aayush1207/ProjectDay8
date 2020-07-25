package Assignment4;

public class starpattern4 
{
	public static void main(String[] args) 
	{
		int i,j,a;
		for (i=1; i<6; i++)
		{
			for (j=6; j>i; j--)
			{
				System.out.print(" ");
			}
			for (a=1; a<=(i*2)-1; a++)
			{
			    System.out.print("*");
		}
			System.out.println();
	}
	}
}
	
		
	


