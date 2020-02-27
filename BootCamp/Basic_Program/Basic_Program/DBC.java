package Basic_Program;

import java.util.Scanner;

public class DBC
{
	@SuppressWarnings({ "resource" })
	public static void main(String rgs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Decimal number :: ");
		int decimal=sc.nextInt();
		int binary[]=new int[20];
		int i=0;
		while(decimal>0)
		{
			int r=decimal%2;
			binary[i++]=r;
			decimal=decimal/2;
		}
		System.out.print("Binary Number:: ");
		for(int j=i-1;j>=0;j--)
			System.out.print(binary[j]+ " ");
		
	}
}
