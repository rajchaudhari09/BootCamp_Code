package Basic_Program;

import java.util.Scanner;

public class Abundant_no
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<number;i++)
		{
		
			if(number%i==0)
			
				sum=sum+i;
			//	n=n/10;
			///System.out.println("Factorial of a " + n + " is " + fact);
		}
		 if(sum>number)
			System.out.print("Abundant Number.");
		else
			System.out.println("Not a Abundant number.");
		
	}
}
