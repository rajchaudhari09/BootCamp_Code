package ZerotoNineNumericPattern;

public class four 
{
	public static void main(String args[])
	{
	int i,j;
	int n =5;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if((j<2&&i<4)||(i==0)||(i==3||j==n ))
				
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
