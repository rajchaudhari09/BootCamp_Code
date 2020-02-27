package skkill_test;

import java.util.Scanner;

public class Greatest_Three_No
{

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int n1=0,n2=0,n3=0;
	//	int arr[]=new int[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st No of: ");	
		n1=sc.nextInt();
		System.out.println("Enter the 2nd No of: ");
		n2=sc.nextInt();
		System.out.println("Enter the 3rd No of: ");
		n3=sc.nextInt();
		if(n1>n2)
		
			System.out.println(n1+"greatest no.");
		
		else if(n2>n3)
		
			System.out.println(n2+"greatest no.");
		else if(n3>n1)
			
			System.out.println(n3+"greatest no.");
		else
			System.out.println("all no are equal:");
	}

}
