package Test;

import java.util.Random;
import java.util.Scanner;

public class dies 
{
	public static void main(String args[]) 
	{
		System.out.println("Enter the no. of dies: ");
		Scanner sc=new Scanner(System.in);
		int n=1;
		boolean flag;
		int max=n,result=0;
		 n=sc.nextInt();
		Random rd=new Random();
		do 
		{
			System.out.println("The value on dies are: ");
			for(int i=1;i<n;i++)
				System.out.println(rd.nextInt(6)+1);
			/*for(int i=1;i<n;i++) 
			{
				if(n>max) 
				{
					max=n;
					result=i;
					
				}
			}*/
		}while(sc.hasNext()==true);
			
		/*while(n>max) 
		{
			for(int i=1;i<n;i++)
				
			max=n;
			System.out.println("maximum time of dies no: "+max);;
		}*/
		return;
	}
}
