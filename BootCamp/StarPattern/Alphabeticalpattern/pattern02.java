package Alphabeticalpattern;

public class pattern02 
{
	public static void main(String args[])
	{
		/*char i;
		char j;
		
		for(i='A';i<='F';i++)
		{
			for(j='A';j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.print("\n");
		}*/
		for(int i=0;i<=25;i++)
		{
			for(int j=25;j>=i;j--)
			{
				System.out.print((char)(i+65));
			}
			System.out.println();
		}
	


	
	}}
