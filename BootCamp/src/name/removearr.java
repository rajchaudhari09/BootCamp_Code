package name;

import java.util.Scanner;

public class removearr {
	public static void main(String args[])
	{
		/* int [] arr = new int [] {1, 2, 3, 4, 5};  
	     System.out.println("Original array: ");  
	     for (int i = 0; i < arr.length; i++) 
	     	{  
	            System.out.print(arr[i] + " ");  
	        }  
	    System.out.println();
	    for (int i = 0; i < arr.length; i++) 
	    {
	    	int j = 0;
			if(i!=j)
	    	{
	    		if(arr[i]==arr[j])
	    		{
	    			int temp=arr[j];
	    			arr[j]=arr[j+1];
	    			arr[j+1]=temp;
	    	       System.out.print(arr[i] + " ");
	    		}
	    	}
	    	 for (int j1 = 0; j1 < arr.length; j1++)
	    	 {
	    		 System.out.println("dispaly after the remove array: ");	
	    	 }
	 }*/
		
		
		int [] arr = new int [50];
		int n,i;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter array size=");
		n=sc.nextInt();
		System.out.println("Enter"+n+"array element=");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Content of an array-");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+"");
		}
	}
	
	

}
