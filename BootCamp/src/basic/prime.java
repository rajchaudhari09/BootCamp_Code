package basic;

import java.util.Scanner;

public class prime 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("entered the number ");
		int n=sc.nextInt();
		int i;
		int c=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0){
				
				c++;
			}
		}
			if(c==2)
			{
				System.out.println("is prime number");
			}else
			{
				System.out.println("it is not prime number");
			}
		}
			
		
		
		
	}


