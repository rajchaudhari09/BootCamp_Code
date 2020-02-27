package Basic_Program;

import java.util.Scanner;

public class HandShake
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int num,total;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		total=num*(num*1)/2;
		System.out.println(total);
	}
}
