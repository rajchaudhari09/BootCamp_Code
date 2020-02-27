package skkill_test;

import java.util.Scanner;

public class Amstronge_giv_range
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Starting no: ");
		int n1=sc.nextInt();
		
		System.out.print("Enter the Endind no: ");
		int n2=sc.nextInt();
		System.out.println("The Amstronge numbers between "+n1+" and "+n2+" are: ");
		int n ;
		int sum ;
		for(int i=n1;i<=n2;i++)
		{

			n=i;
			sum=0;
			while(n!=0)
			{
				int last=n%10;
				sum=sum+(last*last*last);
				n=n/10;
			}
			if(sum==i)
				System.out.println(i);
		
		}
	}
}
		/*while(n!=0)
		{
			int last=n%10;
			sum=sum+(last*last*last);
			n=n/10;
		}
		if(sum==number)
			System.out.println("Amstronge number.");
		else
			System.out.println("Not an Amstronge number.");*/
	

