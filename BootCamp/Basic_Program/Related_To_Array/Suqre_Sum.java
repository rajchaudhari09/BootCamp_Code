package Related_To_Array;

import java.util.Scanner;

public class Suqre_Sum 
{
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String args[])
	{
		int j=0;
		int[] arr=new int[40];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size: ");
		int size=sc.nextInt();
		System.out.println("Enter the Element: ");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.println("Squre of element: "+SqureSum(arr,size));
	}

	private static int SqureSum(int[] a, int size)
	{
		int sum=0;
		int squre=0;
		for(int i=0;i<size;i++)
		{
			squre=a[i]*a[i];
			sum=sum+squre;
		}
		return sum;
	}
}
