package Basic_Program;

import java.util.Scanner;

public class Classroom_Seats
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int n,r,p,temp;
		int num,den;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of seats available: ");
		r=sc.nextInt();
		System.out.print("Enter the no of Person: ");
		n=sc.nextInt();
		if(n<r)
		{
			temp=n;
			n=r;
			r=temp;
		}
		num=fact(n);
		den=fact(n-r);
		p=num/den;
		System.out.print("No of Ways people can be Seated: " +p);
		
	}

	private static int fact(int n) 
	{
		int f=1,i;
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}
}
