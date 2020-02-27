package skkill_test;

import java.util.Scanner;

public class Automorphic_no 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number=sc.nextInt();
	String s1=Integer.toString(number);
	int l1=s1.length();
	int sq=number*number;
	String s2=Integer.toString(sq);
	int l2=s2.length();
	String s3=s2.substring(l2-l1);
	if(s1.equals(s3))
		System.out.println("Automorphic no. ");
	else
		System.out.println("not Automorphic no. ");
	}
}
