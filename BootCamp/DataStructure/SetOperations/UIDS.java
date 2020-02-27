package SetOperations;

import java.util.Scanner;

public class UIDS 
{
	public static void main(String args[])
	{
		System.out.println("Arrays Operation (Unioun,InterSection) :");
		System.out.println("================================================");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the arrya size of Array1:");
		int size1=sc.nextInt();
		System.out.println("Enter the arrya size of Array2:");
		int size2=sc.nextInt();
		int arr1[]=new int[size1];
		int arr2[]=new int[size2];
		System.out.println("Enter the Array element of the Array1:");
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the Array element of the Array2:");
		for(int i=0;i<size2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("Array element of array1 after applying remove duplicate logic:");
		for(int i=0;i<(size1-1);i++)
		{
			for(int j=i+1;j<size1;j++)
			{
				if(arr1[i]==arr1[j])
				{
					for(int k=j;k<(size1-1);k++)
					{
					arr1[k]=arr1[k+1];	
					}
				size1=size1-1;
				}
			}
		}
		for(int i=0;i<size1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println("Array element of array2 after applying remove duplicate logic:");
		for(int i=0;i<(size2-1);i++)
		{
			for(int j=i+1;j<size2;j++)
			{
				if(arr2[i]==arr2[j])
				{
					for(int k=j;k<(size2-1);k++)
					{
					arr2[k]=arr2[k+1];	
					}
				size2=size2-1;
				}
			}
		}
		for(int i=0;i<size2;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		
		
		System.out.println("");
		System.out.println("Enter Union for finding the union of given array");
		System.out.println("Enter Intersection for finding the Intersection of given array");
		String choice=sc.next().toLowerCase();
		switch(choice)
		{
		case "union":
					{
						int flag=0;
						System.out.print("Union of two arrays: ");
						for(int i=0;i<size1;i++)
						{
							System.out.print(arr1[i]+" ");
						}
						for(int i=0;i<size2;i++)
						{
							for(int j=0;j<size1;j++)
							{
								if(arr2[i]!=arr1[j])
								{
									flag=1;
								}
								else
								{
									flag=0;
									break;
								}
							}
							if(flag==1)
							{
								System.out.print(arr2[i]+" ");
							}	
						}
						break;
						
					}
		case "Intersect":
					{
						System.out.println("Intersection of two given arrays: ");
						for(int i=0;i<size1;i++)
						{
							for(int j=0;j<size2;j++)
							{
								if(arr1[i]==arr2[j])
								{
									System.out.print(arr2[j]);
								}
							}
						}
						break;
					}
		default:
					{
						System.out.println("Invalis input!! Exiting the Execution part");
					}
			
			}	
		System.out.println("");
	}
	

}
