package basic;



public class Max_Rep_Arry 
{
	public static void main(String args[]) 
	{
		int arr[]= {1,1,0,5,2,2,5,4,5};
		int n=arr.length;
		int k=9;
		System.out.println("Maximum time repeting duplicate Array no:"+Maxrepeting(arr,n,k));


	}

	private static int Maxrepeting(int[] arr, int n, int k) 
	{

		for(int i=0;i<n;i++) 
			arr[(arr[i]%k)]+=k;
		
		int max=arr[0],result=0;
		for(int i=1;i<n;i++) 
		{
			if(arr[i]>max) 
			{
				max=arr[i];
				result=i;
			}

			//return result;
		}

		//int result=0;
		return result;
	}

}
