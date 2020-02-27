package day4lang;

public class Recursion 
{
	//utillity function to swap two char in a char arry
	public static void main(String args[])
	{
		String s="ABC";
		permutations(s.toCharArray(), 0);
	}
	//recursive function to generate all permutation of a string
	private static void permutations(char[] ch, int currentIndex) 
	{
		if(currentIndex==ch.length-1)
		{
			System.out.println(String.valueOf(ch));
		}
		for(int i=currentIndex;i<ch.length;i++)
		{
			swap(ch,currentIndex,i);
			permutations(ch, currentIndex + 1);
			swap(ch,currentIndex,i);
		}
		// TODO Auto-generated method stub

	}
	//generate all permutation of a string in java
	private static void swap(char[] ch, int i, int j) 
	{
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;

		// TODO Auto-generated method stub

	}
}
