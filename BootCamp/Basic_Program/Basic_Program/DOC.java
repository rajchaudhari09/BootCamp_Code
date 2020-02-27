package Basic_Program;

import java.util.Scanner;

public class DOC 
{
	@SuppressWarnings({ "resource" })
	public static void main(String rgs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Decimal number :: ");
		int decimal=sc.nextInt();
		int oct[]=new int[20];
		int i=0;
		while(decimal>0)
		{
			int r=decimal%8;
			oct[i++]=r;
			decimal=decimal/8;
		}
		System.out.print("Octal Number:: ");
		for(int j=i-1;j>=0;j--)
			System.out.print(oct[j]+ " ");
		
	}
}
