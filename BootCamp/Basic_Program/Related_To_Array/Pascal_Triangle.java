package Related_To_Array;

import java.util.Scanner;

public class Pascal_Triangle 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int line;
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of lines: ");
		line=sc.nextInt();
		for(i=0;i<line;i++)
		{
			for(j=0;j<line-i-1;j++)
			{
				System.out.println(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print(" "+fact(i)/(fact(j)*fact(i-j)));
			}
			System.out.println("");
			
		}
	}

	private static int fact(int num) 
	{
		int f=1,i=1;
		while(i<=num)
		{
			f=f*i;
			i++;
		}		
		return f;
	}
}
