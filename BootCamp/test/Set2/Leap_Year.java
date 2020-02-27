package Set2;

import java.util.Scanner;

public class Leap_Year 
{
	@SuppressWarnings("resource")
	public static void main(String args[]) 
	{
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Year: ");
		year=sc.nextInt();
		if(year%400==0) 
		{
			System.out.println(year+"is a Leap Year.");
		}
		else if(year%100==0) 
		{
			System.out.println(year+"is a not Leap Year.");
		}
		else if(year%4==0) 
		{
			System.out.println(year+"is a Leap Year.");
		}
		else 
		{
			System.out.println(year+"is a not Leap Year.");
		}
	}
}
