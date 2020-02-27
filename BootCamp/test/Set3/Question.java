package Set3;

public class Question 
{
	private static final String StdIn = null;
	public static void main(String args[]) 
	{
		int k=Integer.parseInt(args[0]);
		int n=(int)Math.pow(2, k);
		System.out.printf("Think of an integer between%d and %d\n",0,n-1);
		int secret=search(0,n);
		System.out.printf("Your number %d\n",secret);
	}
	public static int search(int high,int low) 
	{
		if((high-low)==1)
			return low;
		int mid=low+(high-low)/2;
		System.out.printf("It is less than %d",mid);
		if(StdIn.contains(null))
			return search(low,mid);
		return search(low,high);
		
	}
}
