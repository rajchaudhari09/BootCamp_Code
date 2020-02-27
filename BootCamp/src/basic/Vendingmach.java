package basic;

import java.util.Scanner;

public class Vendingmach 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int rupees=0; ;
	int Notes[]={1000,500,200,100,50,20,10,5,2,1};
	int NotesFlag[]={0,0,0,0,0,0,0,0,0,0};
	System.out.println(" :::::::::::::::::Enter The Rupees::::::::::::::::::     ");
	rupees=sc.nextInt();
	
	
	for(int i=0;i<NotesFlag.length;i++)
	{
		if(rupees<0)
			
			return;
		else if(rupees>Notes[i])
		{
			NotesFlag[i]=rupees/Notes[i];
			rupees=rupees%Notes[i];
			
		}
	}
	for(int i=0;i<NotesFlag.length;i++)
	{
		if(NotesFlag[i]>0)
			System.out.println("Notes"+Notes[i]+"NotesCount"+NotesFlag[i]);
	}
	};
}
