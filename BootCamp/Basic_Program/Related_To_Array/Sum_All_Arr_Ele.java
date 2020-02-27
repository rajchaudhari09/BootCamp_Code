package Related_To_Array;

import java.util.Scanner;

import basic.Arry;

@SuppressWarnings("unused")
public class Sum_All_Arr_Ele 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int[]a=new int[50];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size=sc.nextInt();
		System.out.println("Enter the Element");
		for(int i=0;i<size;i++)
		a[i]=sc.nextInt();
		System.out.println("sum: "+sum(a,size));

	}

	private static int sum(int[] arr, int size) 
	{
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}

}

