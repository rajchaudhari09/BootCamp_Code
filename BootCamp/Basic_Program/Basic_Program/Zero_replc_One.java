package Basic_Program;

import java.util.Scanner;

public class Zero_replc_One 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number:: ");
		int number=sc.nextInt();
		String str=Integer.toString(number);
		int len=str.length();
		String str1="";
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)=='0')
				str1=str1+'1';
			else
				str1=str1+str.charAt(i);
		}
		System.out.print("output : : " +str1);
	}
}
