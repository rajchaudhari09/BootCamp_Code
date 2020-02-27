package day4lang;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Anagram 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		String str1,str2;
		boolean check;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first String:");
		str1=sc.nextLine();
		System.out.println("Enter the Second String:");
		str2=sc.nextLine();
		check= isAnagram(str1, str2);

		if(check==true)
		{
			System.out.println("'"+str1+"'and'"+str2+"'are Anagram'");
		}
		else
		{	
			System.out.println("'"+str1+"'and'"+str2+"'are not Anagram'");
		}
	}

	private static boolean isAnagram(String str1, String str2) 
	{
		char[]w1=str1.replaceAll("[\\s]","").toCharArray();
		char[]w2=str2.replaceAll("[\\s]","").toCharArray();
		Arrays.sort(w1);
		Arrays.sort(w2);
		return Arrays.equals(w1, w2);
	}
}
