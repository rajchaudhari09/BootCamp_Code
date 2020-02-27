package Basic_Program;

import java.util.Scanner;

public class Reverse_Of_No 
{
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		System.out.println("Reverse of"+number+"is");
		int reverse=0;
		String s="";
		while(number!=0)
		{
			int last=number%10;
			s=s+Integer.toString(last);
			number=number/10;
		}
		System.out.println(s);
	}
}
