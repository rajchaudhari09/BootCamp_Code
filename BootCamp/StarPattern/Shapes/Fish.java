package Shapes;

import java.util.Scanner;

public class Fish 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		int i,j,k,l,n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		n=sc.nextInt();
		//fish upper body part
		for(i=1;i<=n;i++) 
		{
			for( j=1;j<=n-i;j++) 
			{
				System.out.print("  ");
			}
			for(k=1;k<=2*i-1;k++) 
			{
				System.out.print("*");
			}
			for(j=1;j<=2*(n-i);j++) 
			{
				System.out.print(" ");
			}
			for(l=3;l<=i;l++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//fish lower body part
		for(i=n-1;i>=1;i--) 
		{
			for( j=1;j<=n-i;j++) 
			{
				System.out.print("  ");
			}
			for(k=1;k<=2*i-1;k++) 
			{
				System.out.print("*");
			}
			for(j=1;j<=2*(n-i);j++) 
			{
				System.out.print(" ");
			}
			for(l=3;l<=i;l++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}