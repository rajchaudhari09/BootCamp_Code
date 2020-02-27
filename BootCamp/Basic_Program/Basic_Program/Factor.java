package Basic_Program;

import java.util.Scanner;

public class Factor
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no: ");
		n=sc.nextInt();
		System.out.println("Factors of " + n + " are: ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+ " ");
		}
	}
}
