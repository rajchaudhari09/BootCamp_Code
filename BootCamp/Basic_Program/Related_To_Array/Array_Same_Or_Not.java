package Related_To_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Same_Or_Not 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int[] a1=new int[50];
		int[] a2=new int[50];
		System.out.print("Enter size of arry 1::  ");
		Scanner sc=new Scanner(System.in);
		int size1=sc.nextInt();
		System.out.println("Enter the elelment: ");
		for(int i=0;i<size1;i++)
			a1[i]=sc.nextInt();
		System.out.print("Enter size of arry 2::  ");
		int size2=sc.nextInt();
		System.out.println("Enter the element: ");
		for(int i=0;i<size2;i++)
			a2[i]=sc.nextInt();
		if(equal(a1,a2))
			System.out.println("Both array are same.");
		else
			System.out.println("array are not same.");
	}

	private static boolean equal(int[] a1, int[] a2) 
	{
		int n=a1.length;
		int m=a2.length;
		Arrays.sort(a1);
		Arrays.sort(a2);
		if(n!=m)
			return false;
		for(int i=0;i<n;i++)
		{
			if(a1[i]!=a2[i])
				return false;
		}
	
		return true;
	}
}
