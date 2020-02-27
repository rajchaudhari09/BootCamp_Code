package Set2;

import java.util.Scanner;

public class Reverse_Word_Giv_Str
{
	/*
	 * @SuppressWarnings("resource") public static void main(String args[]) { String
	 * str; String rev=""; Scanner sc=new Scanner(System.in);
	 * System.out.println("Enter the String: "); str=sc.nextLine(); char
	 * ch[]=str.toCharArray(); for(int i=str.length()-1;i>=0;i--) { rev+=ch[i]; }
	 * System.out.println(rev); }
	 */
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String args[]) {
	String rev="";
	String str = null;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String: ");
	str=sc.nextLine();
	 char ch[]=str.toCharArray();
	String arr[]=str.split(" ");
	
	for(int i=0;i<=2;i++)
	{
	 rev+=arr[arr.length-1-i]+" ";	
	}
	System.out.println(rev);
	}
}
