package day2lang;

import java.util.Scanner;

public class FlipCoin {
@SuppressWarnings({ "unused", "resource" })
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int no;
	String res;
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
	/*public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter no of times to flip the coin");
		int times = s.nextInt();
		flipPerc(times);
		s.close();
	}

	private static void flipPerc(int times) 
	{
		// TODO Auto-generated method stub
		double heads = 0;
		for(int i=0;i<times;i++)
		{
			if(Math.random() > 0.5)
			{
				heads++;
			}
		}
		System.out.println("heads percentage is"+ (float)(heads/times)*100);
		System.out.println("tails percentage is"+ (float)(times-heads)/times*100);
	}*/
}
