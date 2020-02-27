package AtoZAlphabeticalPattern;

public class Ddddd {
	public static void main(String args[])
	{
		int i,j;
		int n=5;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if((j==1  )||(i==1&&j<5)||(i==5&&j<5)||(i==3&&j>5)||(j==5&&i<5&&i>1))
					
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

}}
