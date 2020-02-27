package basic;

import java.util.Arrays;

public class secondlargeusingArr 
{
	public static void main(String args[])
	{
		int arr[]={20,60,30,10,50,80,40,70,56};
		int size=arr.length;
		
		Arrays.sort(arr);//sorted no of arr
		System.out.println("Sorted array :: "+Arrays.toString(arr));
		
		int res=arr[size-2];//2nd lagest no in arr
		System.out.println("2nd Lagest Element is :: "+res);
		
		int res1=arr[size-3];//2nd lagest no in arr
		System.out.println("3rd Lagest Element is :: "+res1);
		
		System.out.println("Minimum = "+arr[0]);//maximum no in arr
		
		System.out.println("Maximum = "+arr[arr.length-1]);//maximum no in arr
	}
}
