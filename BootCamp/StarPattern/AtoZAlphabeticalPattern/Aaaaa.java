package AtoZAlphabeticalPattern;

public class Aaaaa 
{
	public static void main(String args[])
	{
		int i,j;
		int n=5;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if((j==1 || j==n )||(i==1)||(i==3||j==n ))
					
				{
					System.out.print(" *");
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
