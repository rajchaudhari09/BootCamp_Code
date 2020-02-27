package All_Star_Mix;

public class S_P3

{
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		int i,j,k;
		int n=4;
		int z=1;
		for(i=0;i<n;i++)
		{
			for(j=n-1;j>i;j--)
			{
				//if((j==1 || j==n )||(i==1||i==n))

				System.out.print(" ");
			}
			//	else
			for(k=0;k<n;k++)
			{

				System.out.print("*");

			}
			z++;
			System.out.print("\n");
		}

	}
}

