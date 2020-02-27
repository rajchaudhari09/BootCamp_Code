package Set4;

import java.util.Scanner;

public class Gambler
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int goal,stack,time,win=0,bets=0;
		System.out.println("Enter value for stack");
		stack=sc.nextInt();
		System.out.println("Enter value for goal");
		goal=sc.nextInt();
		System.out.println("Enter value for time");
		time=sc.nextInt();
		while(time>0&&stack>0) 
		{
			bets++;
			if(Math.random()<0.5) 
			{
				stack++;
			}
			else 
			{
				stack--;
			}
			if(stack>=goal) 
			{
				win++;
			}
			time--;
		}
		System.out.println("bets"+bets);
		System.out.println("win"+win);
		System.out.println("stack"+stack);
	}

}
