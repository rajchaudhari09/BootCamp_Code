package skkill_test;

import java.util.Scanner;

public class Amstrong_No
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		int n=number;
		int sum=0;
		while(n!=0)
		{
			int last=n%10;
			sum=sum+(last*last*last);
			n=n/10;
		}
		if(sum==number)
			System.out.println("Amstronge number.");
		else
			System.out.println();
	}
}
