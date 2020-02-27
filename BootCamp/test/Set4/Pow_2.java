package Set4;

import java.util.Scanner;

public class Pow_2 
{
	/*
	 * @SuppressWarnings("unused") private static void printTable(int pow) { int val
	 * = 1; for(int i=1;i<=pow;i++) { val = val * 2; System.out.println(val); }
	 * 
	 * } public static void main(String[] args) {
	 * 
	 * @SuppressWarnings("resource") Scanner s = new Scanner(System.in);
	 * System.out.println("Enter the find power of 2 less than 32"); int pow =
	 * s.nextInt(); while(pow>31) { System.out.println("Invalid input");
	 * System.out.println("enter the value less than 32"); pow = s.nextInt(); } }
	 */
	

	
	 
		@SuppressWarnings("resource")
		public static void main(String[] args) 
		{
			int number, i, exponent;
			long power = 1;
			Scanner sc = new Scanner(System.in);
			
			System.out.print(" Please Enter any Number : ");
			number = sc.nextInt();	
			
			System.out.print(" Please Enter the Exponent Value : ");
			exponent = sc.nextInt();	
			
			for(i = 1; i <= exponent; i++)
			{
				power = power * number;
			}
			System.out.println("\n The Final result of " + number + " power " + exponent + " = " + power);
		}
	
}
