package skkill_test;

import java.util.Scanner;

public class Leap_Year_Or_Not 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		if( (year%4==0 && year%100!=0)|| year%400==0)
		
			System.out.println(year+ " IS THE LEAP YEAR;");
		
		else
		
			System.out.println(year+ " IS THE NOT A LEAP YEAR");
		
	}
	

}
