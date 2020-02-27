package ZerotoNineNumericPattern;

public class three
{
	public static void main(String args[])
	{
		int i,j;
		int n=5;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if((j==0 || j==n )||(i==1||i==n)||(i==3||j==n )||(i==3&&i>3&&j<3&&j<2))
					
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
