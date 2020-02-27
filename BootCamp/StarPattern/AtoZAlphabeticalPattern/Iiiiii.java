package AtoZAlphabeticalPattern;

public class Iiiiii 
{
	public static void main(String args[])
	{
		int i,j;
		int n=6;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if((j==3||j==4||i==1||i==6))
					
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}}
}
