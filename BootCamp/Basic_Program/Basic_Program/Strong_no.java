package Basic_Program;

import java.util.Scanner;

public class Strong_no 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number=sc.nextInt();
		int sum=0,fact;
		int n=number;
		while(n!=0)
		{
			fact=1;
			int r=n%10;
			for(int i=r;i>=1;i--)
				fact=fact*i;
				sum=sum+fact;
				n=n/10;
			///System.out.println("Factorial of a " + n + " is " + fact);
		}
		 if(sum==number)
			System.out.print("Strong Number.");
		else
			System.out.println("Not a Strong number.");
		
	}
}
