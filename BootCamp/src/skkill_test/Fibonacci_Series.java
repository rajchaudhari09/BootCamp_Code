package skkill_test;

import java.util.Scanner;

public class Fibonacci_Series 
{
	@SuppressWarnings({ "resource" })
	public static void main(String args[])
	{
		
		int fno=0,sno=1,result;
		int uno;
		int count=0;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		uno=sc.nextInt();
		while(true)
		{
			result=fno+sno;
			count++;
			if(result>=uno)

			{
				break;
			}
			fno=sno;
			sno=result;
			System.out.println("Fib:  ["+count+"]====>"+result);
			
		}
	}
}
