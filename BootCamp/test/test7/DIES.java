package test7;

import java.util.Random;
import java.util.Scanner;

public class DIES 
{
	
	public static void main(String args[]) 
	{
		/*
		 * int no,a = 0,b = 0,c=0,d=0,e=0,f=0,count=0; Scanner sc=new
		 * Scanner(System.in); System.out.println("Enter the number: "); Random rd=new
		 * Random(6); System.out.println(""); no=sc.nextInt(); if(a==1) count++; else
		 * if(b==2) count++; else if(c==3) count++; else if(d==4) count++; else if(e==5)
		 * count++; else if(f==6) count++; else count++;
		 */
		System.out.println("Enter the no. of dies: ");
		Scanner sc=new Scanner(System.in);
		int n=0;
		boolean dies=false;
		int max=n,result=0;
		n=sc.nextInt();
		Random rd=new Random();
		do 
		{
			System.out.println("The value on dies are: ");
			for(int i=0;i<n;i++)
				System.out.println(rd.nextInt(6)+1);
			
			for(int i=0;i<n;i++) 
			
			{
				if(n>max) 
					
				{
					max=n;
					result=i;
					System.out.println("maximum time of dies no: "+max);
					
				}
				
			}		
		
		}while(sc.hasNext()==true);
		return;
		
	}
}
