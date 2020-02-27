package day5lang;

import java.util.Scanner;

public class MathFunction 
{
	public static void main(String args[])
	{
		System.out.print("Enter the Any number: ");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.print("The harmonic series is: ");
		double result=0.0;
		while(num>0)
		{
			result = result+(double)1/num;
			num--;
			System.out.println(result+"");
		}
		System.out.println("");
		
		System.out.println("Output the harmonic series: "+result);
	}
}
