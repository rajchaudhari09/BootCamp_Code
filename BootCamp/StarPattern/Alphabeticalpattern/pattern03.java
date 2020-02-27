package Alphabeticalpattern;

public class pattern03
{
	public static void main(String args[])
	{
		int size=5;
		int i;
		int j;

		for(i =size;i>=-size;i--)
		{
			for(j =Math.abs(i);j<=size;j++)
			{
				System.out.print((char)(j+65));
			}
			System.out.print("\n");
		}
	}
}
