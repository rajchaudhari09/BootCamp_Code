package name;

import java.util.Arrays;

public class secondlargestno 
{
	public static void main(String args[])
	{
		 int[] array = {13, 7, 6, 45, 21, 9, 101, 102}; 
		 int n=array.length;
		 Arrays.sort(array); 
		 System.out.println("Sorted array:"+array);
		 int res=array[n-2];
		 System.out.println("2nd largest number :"+res);
		 
		 
	}

}
