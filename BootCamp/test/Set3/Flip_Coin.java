package Set3;

//import java.util.Random;
import java.util.Scanner;

public class Flip_Coin 
{

	@SuppressWarnings({ "unused", "resource" }) 
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
		int no; String res;
		no=(int)(Math.random()*2);
		if(no==0)
		{
			res="Heads"; 
		} 
		else
		{
			res="Tails";
		}
		System.out.println(res);
	}

	/*
	 * public static void main(String args[]) { Scanner sc=new Scanner(System.in);
	 * System.out.println("Enter the no to FC: "); int num=sc.nextInt(); int n=num;
	 * int count1=0,count2=0; Random rd=new Random(); while(n!=0) { int
	 * val=rd.random(); if(val<0.5) { System.out.println("head"); count1++; } else
	 * if(val>0.5) { System.out.println("tail"); } else {
	 * System.out.println("No. is not valid."); } --n; } int per1,per2;
	 * per1=(count1/num)*100; System.out.println("percentage of head:"+per1);
	 * per2=(count2/num)*100; System.out.println("percentage of tail:"+per2); }
	 */
}
