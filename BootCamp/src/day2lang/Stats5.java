package day2lang;

public class Stats5 {
	public static void main(String args[])
	
	{
		int i;
		double min=0,max=1,avg=5;
		double ar[]=new double[5];
		ar[0]=Math.random();
			for(i=1;i<4;i++)
				{
					ar[i]=Math.random();
					min=Math.min(min, ar[i]);
					max=Math.max(max, ar[i]);
					avg+=ar[i];
				}
			avg=avg/5;

			System.out.println("max = "+max+"min = "+min+"avg = "+avg);
				
	}

}
