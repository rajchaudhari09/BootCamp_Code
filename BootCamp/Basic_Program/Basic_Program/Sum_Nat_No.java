package Basic_Program;

import java.util.Scanner;

public class Sum_Nat_No 
{
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String args[])
	{
		int n=0;
		int arr[]=new int[n];
		Scanner sc= new Scanner(System.in);
		int sum=0;
		System.out.print("Enter the Natuarl no: ");
		n=sc.nextInt();
		sum+=(n*(n+n))/2;
		System.out.println("sum: "+sum);
	}
}
