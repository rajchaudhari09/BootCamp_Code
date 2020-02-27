package skkill_test;

//import java.util.Scanner;

public class REv 
{
	public static void main (String args[]) 
	{
		//Scanner sc=new Scanner(System.in);
		String name="raj";
		int len=name.length();
		String rev="";
		for(int i=len-1;i>=0;i--) 
		{
			rev=rev+name.charAt(i);
		}
		System.out.print("Reverse name of "+name+" is:"+rev);
	}
}
