package test6;

import java.util.Random;

public class Run
{
	public static void main(String args[]) 
	{
		int[]dies=new int[21];
		String str="";
		Random rd=new Random();
		boolean inRUn=false;
		for(int i=0;i<20;i++) 
		{
			dies[i]=rd.nextInt(6)+1;
		}
		for(int i=0;i<20;i++) 
		{
			str=str+dies[i];
		}
		System.out.println(str);
		
		int count=0;
		int maxcount=0;
		int endposition=0;
		boolean inMax=false;
		for(int i=0;i<20;i++) 
		{
			if(dies[i]==dies[i+1]) 
			{
				count++;
				if(count>=maxcount) 
				{
					maxcount=count+1;
					inMax=true;
				}
			}
			if(dies[i]!=dies[i+1]) 
			{
				if(inMax) 
				{
					endposition=i;
					inMax=false;
				}
				count=0;
			}
		}
		int startpostion=endposition-maxcount+1;
		System.out.println(str.substring(0, startpostion)+"("+str.substring(startpostion, endposition+1)+")"+str.substring(endposition+1, 20));
	}
}
