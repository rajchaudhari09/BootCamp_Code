package Basic_Program;

import java.util.Scanner;

public class OBC
{
	@SuppressWarnings({ "resource" })
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Octal ::  ");
		int oct=sc.nextInt();
		int decimal=0;
		int n=0;
		while(oct>0)
		{
			int temp=oct%10;
			decimal+=temp*Math.pow(8, n);
			oct=oct/10;
		}
		int binary[]=new int[20];
		int i=0;
		while(decimal>0)
		{
			int r=decimal%2;
			binary[i++]=r;
			decimal=decimal/2;
		}
		System.out.print("Binary number :: ");
		for(int j=i-1;i>=0;j--)
			System.out.print(binary[j] + "");
	}
}
