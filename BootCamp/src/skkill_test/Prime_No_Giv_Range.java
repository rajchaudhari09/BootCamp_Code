package skkill_test;

import java.util.Scanner;

public class Prime_No_Giv_Range 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the starting no: ");
		int n1=sc.nextInt();
		System.out.print("Enter the Ending no: ");
		int n2=sc.nextInt();
		System.out.println("The prime are Entered");
		int flag=0;
		for(int i=n1;i<=n2;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
				{
					flag=1;
				}
			}
				if(flag==1)
				{
					System.out.println(i);
				}
			
		}
	}
}
