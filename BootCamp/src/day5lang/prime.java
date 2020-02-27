package day5lang;

import java.util.Scanner;

public class prime 
{
	private static Scanner s;

	public static void main(String args[])
	{
		s = new Scanner(System.in);
		System.out.println("entered the number ");
		int n=s.nextInt();
		int i;
		
		for(i=n;i<=n;i++)
		{
			if(n%2==0)
			{
				System.out.println("no isnt prime");
			}else
			{
				System.out.println("no is prime");
			}
		}
	}
	
}/*isPrime=1;
		//for(i=2;i<=end;i++)
		//{	
			for(i=2;j=i/2;i++)
			{
				
				if(j%i==0)
				{
					isPrime=0;
					break;
				}
			}
				if(isPrime==1)
				{
				System.out.println(i);
				sum+=i;
				}
		//}
		System.out.println("sum of all prime no upto 1000="+sum);
		*/
	


