package Related_To_Array;

//import java.util.Scanner;

public class Second_Smallest_no
{
	public static void main(String args[])
	{
		
		int arr[]={20,60,30,10,50,80,40,70,56};
		int size=arr.length;
		int res=arr[size-6];//2nd lagest no in arr
		System.out.println("2nd Lagest Element is :: "+res);
		System.out.println("Minimum = "+arr[0]);//maximum no in arr
	}
}
