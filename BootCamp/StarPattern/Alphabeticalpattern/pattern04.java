package Alphabeticalpattern;

public class pattern04 
{
	public static void main(String args[])
	{
		int n=9; int i; int j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j||i+j==n-1)
				{
					System.out.print((char)(i+65));
					System.out.print("  ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}
}
