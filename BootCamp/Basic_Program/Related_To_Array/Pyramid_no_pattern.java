package Related_To_Array;

public class Pyramid_no_pattern 
{
	public static void main(String args[])
	{

		int n=4;
		int z=1;

		for(int i=0;i<=n;i++)
		{

			for(int j=n-1;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<z;k++)
			{
				System.out.print(z-i);
			}
			z+=2;
			System.out.println();
		}


	}

}
