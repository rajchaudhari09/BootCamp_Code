package Sorting;

public class Sreach
{
	public static void main(String args[])
	{
		String[]arr={"raj","varsha","gitu","nami","dhanu","vipul","shweta","choti","harsh","prassana","shiv"};
		String x= "nami";
		int result = binarySearch(arr,x);
		if(result==-1)
			System.out.println("Element not present");
		else
			System.out.println("Element fount is "+"position "+result);
	}

	private static int binarySearch(String[] arr, String x)
	{
	int l=1,r=arr.length-1;
	while(l<=r)
	{
		int m=l+(r-l)/2;
		int res=x.compareTo(arr[m]);
		if(res==0)
			return m;
		if(res>0)
			l=m+1;
		else
			r=m-1;
	}
		return -1;
	}
}
