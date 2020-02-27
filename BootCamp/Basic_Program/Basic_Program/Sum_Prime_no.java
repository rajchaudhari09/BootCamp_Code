package Basic_Program;

import java.util.Scanner;

public class Sum_Prime_no 
{
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number=sc.nextInt();
		int x=0;
		for(int i=2;i<=number;i++)
		{
			if(prime_or_not(i)==1)
			{
				if(prime_or_not(number-i)==1)
				{
					System.out.println(number+ "=" +i+ "+" +(number-i));
					x=1;
				}
			}
		}
	}

	private static int prime_or_not(int n) 
	{
		int c=1;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				c=0;
				break;
			}
		}
		return c;
	}
}
