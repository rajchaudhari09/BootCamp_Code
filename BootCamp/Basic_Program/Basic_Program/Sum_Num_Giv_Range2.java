package Basic_Program;

import java.util.Scanner;

public class Sum_Num_Giv_Range2 
{
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args[])
	{
		int n=0,a,b;
		int arr[]=new int[n];
		Scanner sc= new Scanner(System.in);
		int sum=0;
		System.out.print("Enter the 1st no Range: ");
		a=sc.nextInt();
		System.out.print("Enter the 2nd no Range: ");
		b=sc.nextInt();
		int c=a+b;
		sum+=c;
		System.out.println("sum: "+sum);
	} 
}
