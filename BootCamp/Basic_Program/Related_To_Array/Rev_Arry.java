package Related_To_Array;

import java.util.Scanner;

public class Rev_Arry 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int j=0;
		int[] arr=new int[40];
		int[] rev=new int[40];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Size: ");
		int size=sc.nextInt();
		System.out.println("Enter thr element: ");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		for(int i=size-1;i>=0;i--)
		{
			rev[j]=arr[i];
			j++;
		}
		System.out.println("The reverse array.");
		for(int i=0;i<size;i++)
			System.out.print(rev[i]+" ");
	}
}
