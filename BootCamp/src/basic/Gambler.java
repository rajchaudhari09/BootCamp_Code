package basic;

public class Gambler 
{
	/*public static void main(String args[])
	{
		int Stack,goal,T;
		Stack=Integer.parseInt(args[0]);
		goal=Integer.parseInt(args[1]);
		T=Integer.parseInt(args[2]);
		System.out.println("Starting with $"+Stack+"with a goal of $"+goal+",the gambler won " + runTrials(Stack,goal,T)+"/"+T+"Times");
	}
	private static int runTrials(int stack, int goal, int t) 
	{
		return 0;
	}*/

	public static void main(String args[])
	{
		int Stack=Integer.parseInt(args[0]);//Gamblers starting bankroll
		int goal=Integer.parseInt(args[1]);//Gamblers desired bankroll
		int Trials=Integer.parseInt(args[2]);//no of trials to perform
		int bets=0;//total no of bets made
		int wins=0;//total no of games won
		
		//repeat trials times
		for(int i=0;i<Trials;i++)
		{
			//do one gambler's ruin simulaion
			int cash=Stack;
			while(cash>0&&cash<goal)
			{
				bets++;
				if(Math.random()<0.5)
					cash++;//win$1
				else
					cash--;//lose$1
			}
			if(cash==goal)//did gambler go achive desired goal?
				wins++;
		}
		//print results
		System.out.println(wins + " wins of "+ Trials);
		System.out.println("Percentage of games won = " + 100.0 * wins / Trials);
		System.out.println("Avg # bets              = " + 1.0 * bets / Trials);
	}



		
		



}

