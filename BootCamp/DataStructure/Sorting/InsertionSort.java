package Sorting;

import java.util.Arrays;


@SuppressWarnings("unused")
public class InsertionSort 
{
	public static void main(String args[])
	{

		String[]arr1={"raj","varsha","gitu","nami","dhanu","vipul","shweta","choti","harsh","prassana","shiv"};
		String[]arr2=doInsertionSort(arr1);
			for(String i:arr2)
			{
				System.out.print(i);
				System.out.print(", ");
			}


	}

	private static String[] doInsertionSort(String[] arr1)
	{
		String temp;
	    for(int i=1;i<arr1.length;i++)
	    {
	    	for(int j=i;j>0;j--)
	    	{
	    		if(arr1[j] != arr1[j-1])
	    		{
	    			temp=arr1[j];
	    			arr1[j]=arr1[j-1];
	    			arr1[j-1]=temp;
	    		}
	    	}
	    }
	    return arr1;
	    
	
	}
}
