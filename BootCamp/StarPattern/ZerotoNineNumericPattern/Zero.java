package ZerotoNineNumericPattern;

public class Zero
{
	public static void main(String args[])
	{
		int i,j;
		for(i=0;i<=11;i++)
		{
			for(j=0;j<=6;j++)
			{
				if(i<2 && j>0 && j<6 || i>9&& j>0 && j<6 || i>1 && i<10 && j<1 || i>1 && i<10 && j>5)
				{
				System.out.print("**");	
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
