package Sorting;



public class BublleSort
{
	public static void main(String args[])
	{

		System.out.println("Enter the value in an arry: ");
		String[]arr={"raj","varsha","gitu","nami","dhanu","vipul","shweta","choti","harsh","prassana","shiv"};
		int n=arr.length;
		sortStrings(arr,n);
		System.out.println("String in sorted order is:");

		for(int i=0;i<n;i++)

			System.out.println("String "+(i+1)+" is : "+arr[i]);
	}

	private static void sortStrings(String[] arr, int n)
	{
		String temp;
		//Sorting string bubble sort in asending order
		for(int j=0;j<n-1;j++)
		{
			for(int i=j+1;i<n;i++)
			{
				if(arr[j].compareTo(arr[i])>0)
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;

				}
			}

		}


	}
}
