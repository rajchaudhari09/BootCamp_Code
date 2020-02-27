package Basic_Program;

import java.util.Scanner;

public class Sum_Num_Giv_Range 
{
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args[])
	{
		int n=0;
		int arr[]=new int[n];
		Scanner sc= new Scanner(System.in);
		int sum=0;
		System.out.print("Enter the First Natuarl no Range: ");
		n=sc.nextInt();
		System.out.print("Enter the Last Natuarl no Range: ");
		n=sc.nextInt();
		sum+=(n*(n+n))/2;
		System.out.println("sum: "+sum);
	} 
}
