package Basic_Program;

import java.util.Scanner;

public class ODC 
{
	@SuppressWarnings({ "resource" })
	public static void main(String rgs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a octal number :: ");
		int oct=sc.nextInt();
		//int oct[]=new int[20];
		int n=0;
		int decimal=0;
		while(oct>0)
		{
			int temp=oct%10;
			//int r=oct%10;
			decimal+= temp*Math.pow(8, n);
			oct=oct/10;
			n++;
		}
		//System.out.print("Decimal Number:: ");
		//for(int j=i-1;j>=0;j--)
			System.out.print("decimal number :: " +decimal);
		
	}
}
