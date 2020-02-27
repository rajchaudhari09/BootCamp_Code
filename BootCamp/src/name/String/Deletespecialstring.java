package name.String;

import java.util.Scanner;

public class Deletespecialstring 
{
	public static void main(String args[])
	{
	
		StringBuffer sbf=new StringBuffer("I am a Bridgelab student.");
		//check this word
		String text="I am a Bridgelab student.";
		
		System.out.println("String Buffer=" +sbf);
		
		//print the cheacking words 
		System.out.println(text.contains(""));
	
		
		sbf.delete(4, 9);
		System.out.println("After deletion String Buffer is : = " +sbf );
		
	}
}
