package ZerotoNineNumericPattern;

public class one
{
	public static void main(String args[])
	{
/*		int i,j,k;
	//	int n=5;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i<2 && j>0 && j<6 || i>9&& j>0 && j<6 || i>1 && i<10 && j<1 || i>1 && i<10 && j>5)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}*/
		int i,j;
		for(i=0;i<=4;i++)
		{
			for(j=0;j<=4;j++)
			{
				if(i==0 && j==2|| i==1 && j==1||i<4 && j==2 || i>3)
				{
				System.out.print("*");	
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

}
