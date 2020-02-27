package skkill_test;

import java.util.Scanner;

public class Factorial
{
	@SuppressWarnings({ "resource" })
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		if(n>=0)
		{
			int fact=1;
			for(int i=n;i>=1;i++)
				fact=fact*i;
			System.out.println("Factorial of a " + n + " is " + fact);
		}
		else
			System.out.print("value is define   ////+o || o+\\\\ ");
		
	/*	//int n! = 0;
		//for(int i=0;i<=fact;i++)
		{
			n! = n*(n-1)*(n-2)*.*1
					System.out.println("factorial no is: " +fact);

		}
		*/
	}
}
