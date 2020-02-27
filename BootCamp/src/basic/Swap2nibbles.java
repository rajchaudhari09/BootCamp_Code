package basic;

import java.util.Scanner;

public class Swap2nibbles 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int num,op;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no: ");
		num=sc.nextInt();
		op= ((num & 0x0f)<<4 | (num & 0xf0)>>4);
		System.out.println("After swap nibble bits no is: "+op);
	}
	/*public static void main(String args[])
	{
		int x=400;
		System.out.println(swapNibb(x));
	}

	private static int swapNibb(int x)
	{
		
		return ((x & 0x0f)<<4 | (x & 0xf0)>>4);
	}*/
	
}
