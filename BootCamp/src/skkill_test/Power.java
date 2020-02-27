package skkill_test;

import java.util.Scanner;

public class Power
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int exp,base,result=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base value: ");
		base=sc.nextInt();
		System.out.print("Enter the exp value: ");
		exp=sc.nextInt();
		while(exp!=0)
		{
			result=result*base;
			--exp;
		}
		System.out.println(" Answer = " + result);
	}
}
