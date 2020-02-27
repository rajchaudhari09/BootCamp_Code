package improveskill;

import java.util.Scanner;

public class while5 {
	public static void main(String args[])
 	{
 		Scanner in=new Scanner(System.in);
		System.out.println("Input the number");
 		int num1=in.nextInt();
 	
 		int i=1;
 		while(i<=10)
 		{
 			//if(i<=+2)
 			System.out.println(num1+"x"+(i+1)+"="+(num1*(i+1)));
 			 i=i+1;
 		}
 	}

}
