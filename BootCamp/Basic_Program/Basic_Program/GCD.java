package Basic_Program;

import java.util.Scanner;

public class GCD
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2=sc.nextInt();
		System.out.print("LCM of " + num1 + " and " + num2 + " is : ");
		int n=1;
		if(num1!=num2)
		{
			while(n!=0)
			{
				n=num1%num2;
				if(n!=0)
				{
					num1=num2;
					num2=n;
				}
			}
			System.out.print(num2);
		}
		else
		System.out.print("XXXXX===Wrong====InputXXXXX ");
	}
}
