package Basic_Program;

import java.util.Scanner;

public class Pos_nd_Neg
{
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args[])
	{
		int n=0;
		int pos=+0,neg=-0;
		int arr[]=new int[n];
		Scanner sc=new Scanner(System.in);	
		System.out.print("Enter the numbers: ");
		n=sc.nextInt();

		
		if(pos<n)
			{
				System.out.println("no is postive. ");
			}
		else
			{
				System.out.println("");
		}
		if(neg>n)
			{
			
				System.out.println("no is negetive. ");
			}
	}		
}
