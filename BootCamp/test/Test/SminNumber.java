package Test;

public class SminNumber 
{

	public static void main(String args[])
	{
		int arr[]={2,3,4,5,6,7};
		//int larg=0;//=arr[0];
		//int Slarg=0;//=arr[0];
		//System.out.print("The array list is: ");
		
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}*/
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arr.length)
			{
				arr[i]=arr.length;
				//larg=arr[i];*/
			}
	/*else if(arr[i]<arr.length)
		{
//				arr.length=arr[i];
			}*/
		}
		System.out.println("Second minmum no: "+arr[1]);
	}
}
