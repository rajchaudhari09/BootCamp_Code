package test7;

import java.util.Scanner;

import Set1.Stopwatch;

public class Stop_Watch 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("////:STOPWATCH://///");
		System.out.println("1.Start: ");
		System.out.println("2.End: ");
		System.out.println("3.Exit: ");
		int n=sc.nextInt();
		long St=0,En=0,Val=0;
		if(n==1) 
		{
			St=System.currentTimeMillis();
			
		}
		int n1=sc.nextInt();
		if(n1==2) 
		{
			En=System.currentTimeMillis();
			Val=En-St;
			System.out.println(Val/10000);
		}
		else 
		{
			return;
		}
	}
	
	
	/*
	 * int stopTimer = 0; int startTimer = 0; public static void main(String args[])
	 * { Scanner sc=new Scanner(System.in); Stopwatch sw=new Stopwatch();
	 * 
	 * System.out.print("Enter the 1 Start time :: ");
	 * 
	 * int n=sc.nextInt(); sw.start();
	 * 
	 * System.out.println();
	 * 
	 * System.out.print("Enter the 2 End time :: "); int u=sc.nextInt(); sw.stop();
	 * 
	 * long elapsed=sw.getElapsedTime(); System.out.println();
	 * System.out.println("Total time Elapsed(in millisec) is: " +elapsed);
	 * System.out.println(); System.out.println("Coverting millisec to seconds: " +
	 * (elapsed/1000)+ " sec"); System.out.println("Coverting millisec to minits: "
	 * + (elapsed/60000)+ " min"); System.out.println("Coverting millisec to hrs: "
	 * + (elapsed/360000)+ "hrs"); }
	 * 
	 * private long getElapsedTime() {
	 * 
	 * long elapsed = startTimer-stopTimer; return elapsed; }
	 * 
	 * private void stop() { long stopTimer = System.currentTimeMillis();
	 * System.out.println("stop time is: " +stopTimer);
	 * 
	 * }
	 * 
	 * private void start() { long startTimer = System.currentTimeMillis();
	 * System.out.println("start time is: " +startTimer);
	 * 
	 * }
	 */
}
