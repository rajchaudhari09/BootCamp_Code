package Basic_Program;

import java.util.Scanner;

public class Palindrom
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		String a, b="";
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String you want to check : ");
		a = s.nextLine();
		int n = a.length();
		for(int i=n-1;i>=0;i--)
		{
			b += a.charAt(i);
		} 
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("The string is Palindrome.");
		}
		else
		{
			System.out.println("The string is not Palindrome.");
		}
	}
}
