package basic;

import java.util.Random;
import java.util.Scanner;

public class CouponNo
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int t=0,n=0,rand,count=0;
		System.out.println("Enter Range: ");
		n=sc.nextInt();
		int arr[]=new int[n];
		while(t<n)
		{
			if(t==0)
			{
				arr[t]=rd.nextInt(n);
				count++;
			}
			else
			{
				int z=0;
				while(z==0)
				{
					int x=0;
					rand=rd.nextInt(n);
					count++;
					for(int i=0;i<t;i++)
					{
						if(rand==arr[i])
						{
							x++;
						}
					}
					if(x==0)
					{
						arr[t]=rand;
						z++;
					}
				}
			}
			t++;
		}
		for(int i=0;i<n;i++)
			System.out.println("Random number are \n "+arr[i]);
			System.out.println("Total Random No Required"+count);
	}
}
