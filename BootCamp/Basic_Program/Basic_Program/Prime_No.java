package Basic_Program;

import java.util.Scanner;

public class Prime_No
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number::  ");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				count=count+1;
				
			}
			if(count==2)
				System.out.println("Number is the prime.");
			else
				System.out.println("Number is not prime.");
			
	}
	
}
