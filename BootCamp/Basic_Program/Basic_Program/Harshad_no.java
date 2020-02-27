package Basic_Program;

import java.util.Scanner;

public class Harshad_no 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int n=number;
		int result=0;
		while(n!=0)
		{

			int last=n%10;
			result=result+last;
			n=n/10;

		}
		if(number%result==0)
			System.out.print("Harshad Number.");
		else
			System.out.println("Not a Harshad number.");

	}
}
