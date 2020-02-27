package Related_To_Array;

public class Diomand_No_Pattern
{
	

	public static void main(String args[])
	{

			int size=4;
			int p=1;

			for(int i=size;i>=-size;i--)
			{
				for(int j=1;j<=Math.abs(i);j++)
				{

					System.out.print(" ");
				}
				for(int k=size;k>=Math.abs(i);k--)
				{
					System.out.print(p+" ");
				}
				if(i>0)
					p++;
				else
					p--;

				System.out.println();
			}
		}


}
