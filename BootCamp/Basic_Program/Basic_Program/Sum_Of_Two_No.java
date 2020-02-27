package Basic_Program;

import java.util.Scanner;

public class Sum_Of_Two_No 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int a=0,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a numbers: ");
		int n=sc.nextInt();
		while(n!=0)
		{
			b=n%10;
			b=b+a;
			n=n/10;
		}
		System.out.println("Sum of digits: "+b);
		
		
		
		
	}
}
