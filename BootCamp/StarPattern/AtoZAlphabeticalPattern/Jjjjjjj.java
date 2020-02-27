package AtoZAlphabeticalPattern;

public class Jjjjjjj
{
	public static void main(String args[])
	{
		int i,j;
		int n=6;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if((j==5||j==6||i==1&&j>1||i==6&&j>1||j==2&&i>4||j==3&&i>4))
					
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
