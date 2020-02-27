package Set5;

import java.util.Scanner;

public class Harmonic_no 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		try
		{
		System.out.println("Enter the harmonic no to find ");
		int n = s.nextInt();
		System.out.println(harmonic(n));
		
		}
		catch(Exception e)
		{
			System.out.println("Enter integer");
			main(args);
		}
	}

	private static char[] harmonic(int n) {
		// TODO Auto-generated method stub
		double h = 1;
		for(double i=2;i<=n;i++)
		{
			h=h+1/i;
		}
		return null;
	}
}
