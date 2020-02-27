package Basic_Program;

import java.util.Scanner;

public class Qurdatic_Qurdinates 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Co-oridinates :: ");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Given a Co-ordinates "+x+" and " +y+ " is: ");
		if(x>0&&y>0)
			System.out.printf("point lies in the first quardant"+x,y);
		else if(x<0&&y>0)
			System.out.printf("point lies in the Second quardant"+x,y);
		else if(x<0&&y<0)
			System.out.printf("point lies in the third quardant"+x,y);
		else if(x>0&&y<0)
			System.out.printf("point lies in the Fourth quardant"+x,y);
		else if(x==0&&y==0)
			System.out.printf("point lies in the origin"+x,y);
	}
}
