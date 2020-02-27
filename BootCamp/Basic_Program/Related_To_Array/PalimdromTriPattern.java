package Related_To_Array;

import java.util.Scanner;

public class PalimdromTriPattern 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int n=10,i,l,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		n=sc.nextInt();
		System.out.println(" ");
		for(i=1;i<=n;i++)
		{
			for(k=n-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(l=i-1;l>=-(i-1);l--)
			{
				System.out.print( i-Math.abs(l));
			}
			System.out.println(" ");
			
		}
			
		
	}
}
