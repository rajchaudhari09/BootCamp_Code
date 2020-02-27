package Test;

public class SlargeNumber 
{

	public static void main(String args[])
	{
		int arr[]={2,3,4,5,6,7};
		int larg=arr[0];
		int Slarg=arr[0];
		System.out.print("The array list is: ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>larg)
			{
				Slarg=larg;
				larg=arr[i];
			}
			else if(arr[i]>Slarg)
			{
				Slarg=arr[i];
			}
		}
		System.out.println("Second largest no: "+Slarg);
	}
}
