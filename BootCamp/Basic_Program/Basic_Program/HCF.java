package Basic_Program;

import java.util.Scanner;

public class HCF 
{
	@SuppressWarnings({ "resource" })
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		num1=sc.nextInt();
		System.out.print("Enter the Second Number: ");
		num2=sc.nextInt();
		int n=1;
		System.out.print("HCF of " + num1 + " and "+ num2 + " is:: " );
		if(num1!=num2)
		{
			while(n!=0)
			{
				n=num1%num2;
				if(n!=0)
				{
					num1=num2;
					num2=n;
				}
			}
			System.out.println(num2);
		}
		else
			System.out.println("XXXX-Wrong input-XXXX");
		
	}
}
