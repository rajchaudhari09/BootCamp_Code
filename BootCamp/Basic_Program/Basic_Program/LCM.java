package Basic_Program;

import java.util.Scanner;

public class LCM 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2=sc.nextInt();
		int i;
		int a=(num1>num2)?num1:num2;
		for(i=a;i<=num1*num2;i=i+a)
		{
			if(i%num1==0&&i%num2==0)
				break;
		}
		System.out.println("LCM of " + num1 + " and " + num2 + " is : "+ i);
	}
}
