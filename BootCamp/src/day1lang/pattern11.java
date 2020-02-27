package day1lang;

import java.util.Scanner;

public class pattern11 
{
	public static void main(String[] args)
{
		
		int i,j,k,l,count=6;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		String c=sc.nextLine();
	if(c.equalsIgnoreCase("K"))			//KKKKKKKK
	 {		
	  for(i=0;i<=11;i++)
	   {
		for(j=0;j<2;j++)
		{
			System.out.print("*");
		}
		for(k=0;k<=6;k++)
		{
		if(k==count)
		{
			System.out.print("***");
		}
		else
		{
			System.out.print("  ");
		}
	   }
	   if(i<=5)
		{
			count--;
		}
		else if(i<=11)
		{
			count++;
		}
		System.out.println();
	   }
	}
		else if(c.equalsIgnoreCase("D"))			//DDDDDDDDD
		{
		for(i=0;i<=11;i++)
		{
			for(j=0;j<=2;j++)
			{
				System.out.print("*");
			}
			for(k=1;k<=5;k++)
			{
				if(k>=0 && i<2 || i>9 && i<=11 || k==5)
				{
					System.out.print("**");
				}
				else
				{
					System.out.print("  ");//two spaces
				}
			}
			for(j=0;j<=1;j++)
			{
				if(i>=0 && i<2 || i>9 && i<=11)//copy and paste
				{
					System.out.print(" ");//one space
				}
				else
				{	
					System.out.print("*");
				}
			}
		System.out.println();
		}
		}
		if(c.equalsIgnoreCase("W"))				////WWWWWWW
		{
		for(i=0;i<=11;i++)
		{
			for(j=0;j<=2;j++)
			{
				System.out.print("*");
			}
			for(k=10;k>=i;k--)
			{
				System.out.print(" ");//single space
			}
			for(j=0;j<=2;j++)
			{
				System.out.print("*");
			}
			
			for(l=1;l<=i;l++)
			{
				System.out.print("  ");//two space
			}
			for(j=0;j<=2;j++)
			{
				System.out.print("*");
			}
			for(k=10;k>=i;k--)
			{
				System.out.print(" ");//single space
			}
			for(j=0;j<=2;j++)
			{
				System.out.print("*");
			}
			
			
		 System.out.println();
		}
		}
		System.out.println();	
      }
	

}