package BinarySearch;

import java.util.Scanner;

public class BSearch1
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of an arry : ");
		int n=in.nextInt();
		
		int[]arr=new int[n];
		System.out.println("Enter the value in an array: ");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter value to be Search: ");
		int num=in.nextInt();
		int low=0;
		int high=n-1;
		int mid=0;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]==num)
			{
				System.out.println("value is found at index"+mid);
				break;
			}
			else if(arr[mid]>num)
			{
				high=mid-1;
			}
			else if(arr[mid]==num)
			{
				low=mid+1;
			}
		}
		if(low>high)
		{
			System.out.println("value is not found");
		}
	}
}
