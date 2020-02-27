package ZerotoNineNumericPattern;

public class five
{
	public static void main(String args[])
	{
		int i,j;
		int n =5;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if((j<2&&i<4)||(i==1||i==5)||(i==3||j>4&&i>3))
					
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
