
package skkill_test;

import java.util.Scanner;

public class Greatest_Two_No
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int n1=0,n2=0;
	//	int arr[]=new int[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st No of: ");	
		n1=sc.nextInt();
		System.out.println("Enter the 2nd No of: ");
		n2=sc.nextInt();
		if(n1>n2)
		
			System.out.println( n1 + "greater than" + n2);
		
		else if(n2>n1)
		
			System.out.println( n2 + "greater than" + n1);
		
		else
			System.out.println("both no are equal:");
		}
}
