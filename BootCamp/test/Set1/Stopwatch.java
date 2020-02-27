package Set1;

import java.util.Scanner;

public class Stopwatch
{
	
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		Stopwatch sw=new Stopwatch();

		System.out.print("Enter the 1 Start time :: ");

		sc.nextInt();
		sw.start();
		
		System.out.println();
	
		System.out.print("Enter the 2 End time :: ");
		sc.nextInt();
		sw.stop();
		
		long l=sw.getElapsedTime();
		System.out.println();
		System.out.println("Total time Elapsed(in millisec) is: " +l);
		System.out.println();
		System.out.println("Coverting millisec to seconds: " + (0/1000)+ " sec");
	}

	public long getElapsedTime() 
	{
		int stopTimer = 0;
		int startTimer = 0;
		long elapsed = stopTimer-startTimer;
		return elapsed;
	}

	public void stop()
	{
		long stopTimer = System.currentTimeMillis();
		System.out.println("stop time is: " +stopTimer);
		
	}

	public void start() 
	{
		long startTimer = System.currentTimeMillis();
		System.out.println("start time is: " +startTimer);
		
	}
	
}

