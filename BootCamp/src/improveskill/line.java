package improveskill;

import java.util.Scanner;

public class line {
	
	public static void main(String args[])
 	{
 		Scanner in=new Scanner(System.in);
		System.out.println("Input the number");
 		int num1=in.nextInt();
 		//int i,i1,j;
 		int i;
 		for( i=0;i<=10;i++)
 		{
 			System.out.println(num1+"x"+(i+1)+"="+(num1*(i+1)));
 		}
 		
 
 		/*for(i1=0;i1<=11;i1++){
 			
			System.out.println("|");
		
	}*/
 	}
	
	
	

}