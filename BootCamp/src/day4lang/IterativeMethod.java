package day4lang;

import java.util.List;
import java.util.ArrayList;

public class IterativeMethod 
{
	//Iterative function to generate all permutationof a string in java

	public static void main(String args[])
	{
		String s="RAJ";
		permutations(s);
	}
	//Iterative function to generate all permutationof a string in java
	//using collection

	private static void permutations(String s) 
	{
		//create an empty arrylist to store(partial)permutation
		List<String> partial = new ArrayList<>();

		//initialize the list with the first char of the string
		partial.add(String.valueOf(s.charAt(0)));

		//do for every char of the specified string 
		for(int i=1;i<s.length();i++)
		{
			//consider previesouly constructed partial permutation one by one
			
			//(iterative backwards to avoid concurrentmpodificationexception)

			for(int j=partial.size()-1;j>=0;j--)
			{

				//remove current partil permutation from the arrylist
				String str = partial.remove(j);

				//insert next char of the specified string in all
				//possible position of current partial permutation. then
				//insert each of these newaly constructed string in the list


				for(int k=0;k<=str.length();k++)
				{

					//advice: use stringbuilder for concatenation

					partial.add(str.substring(0, k) + s.charAt(i) + str.substring(k));
				}
			}
		}
		System.out.println(partial);
		// TODO Auto-generated method stub

	}
}
