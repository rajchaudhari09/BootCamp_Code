package basic;

public class seclargest
{
	public static void main(String args[])
	{
	int i;
		int a[]={22,55,4,67,88,7,46};
		int N=a.length;
		//int i;
		for(i=0;i<N;i++)
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			
		
		System.out.println("second largest"+a[N-2]);
		}
	}
	}

