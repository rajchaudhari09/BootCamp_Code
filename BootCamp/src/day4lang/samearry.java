package day4lang;

public class samearry
{
	// This function returns the least lexicogr 
	// aphical String obtained from its two halves 
	static String leastLexiString(String s) 
	{ 
		// Base Case - If String size is 1 
		if (s.length() == 1) 
			return s; 

		// Divide the String into its two halves 
		String x = leastLexiString(s.substring(0,s.length() / 2)); 
		String y = leastLexiString(s.substring(s.length() / 2)); 

		// Form least lexicographical String 
		return String.valueOf((x + y).compareTo(y + x)); 
	} 

	static boolean areEquivalent(String a, String b) 
	{ 
		return !(leastLexiString(a).equals(leastLexiString(b))); 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		String a = "rajj"; 
		String b = "raj"; 
		if (areEquivalent(a, b)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 

		a = "rajj"; 
		b = "raj"; 
		if (areEquivalent(a, b)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
	} 
} 



