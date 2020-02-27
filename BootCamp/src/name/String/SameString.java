package name.String;

import java.util.Scanner;

public class SameString {
	 
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		String s1= new String(" ");
		String s2= new String(" ");;
		Scanner s=new Scanner(System.in);
		//System.out.print("Entered the 1st String is name: ");
		s1=s.nextLine();
		//System.out.print("Entered the 2nd  String is name: ");
		s2=s.nextLine();
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		//int n=s1.length();
		//int n1=s2.length();
		//while(s1.equals(s2))
		//{
			//s2 += s1.charAt(n);
		//for(int i=n; i<=n1; i++)
		//{
		
		/*boolean user = true;	
				if(s1 == s2)
				{
					System.out.print("String is Same.");
			
				}
				else
				{
					System.out.print("String is not Same.");

				}*/
	//		}
		
		//System.out.println();
		//}
	}
}
