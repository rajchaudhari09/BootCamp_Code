package Basic_Program;

import java.util.Scanner;

public class Friendly_pair 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int number1=sc.nextInt();
		System.out.print("Enter the second number: ");
		int number2=sc.nextInt();
		int add1=0,add2=0;
		
		for(int i=1;i<number1;i++)
		{
		
			if(number1%i==0)
			
				add1=add1+i;
		}
		for(int i=1;i<number2;i++)
		{
		
			if(number2%i==0)
			
				add2=add2+i;
			//	n=n/10;
			///System.out.println("Factorial of a " + n + " is " + fact);
		}
		 if(number1==add2&&number2==add1)
			System.out.print("friendly pair Number.");
		else
			System.out.println("Not a friendly pair number.");
		
	}
}
