package Test;

public class Tnum 
{
	public static void main(String args[]) 
	{
		int arr[]= {0,1,-1,2,-2,-3,3};
		int n=arr.length;
		findTriples(arr,n, arr);
	}

	private static void findTriples(int[] arr, int n, int[] a)
	{
		int count=0;
		boolean sum=true;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++) 
			{
				for(int k=j+1;k<n;k++) 
				{
					//int[] a=0;
					if(a[i]+a[j]+a[k]==0) 
					{
						System.out.print("arr[i]: ");
						System.out.print(" ");
						System.out.print("arr[j]: ");
						System.out.print(" ");
						System.out.print("arr[k]: ");
						System.out.print(" ");
						sum=true;
						System.out.println(arr[i]+""+arr[j]+""+arr[k]+"");
						count++;
					}
				}
			}
		}		
		if(sum==false)
			System.out.println("Not exit.");
		count++;
	}
	
}
