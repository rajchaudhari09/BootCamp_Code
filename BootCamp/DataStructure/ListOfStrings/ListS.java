package ListOfStrings;

public class ListS
{
/*************************************REVERSE STRING PROGRAME**********************************************
	
	public static void main(String args[])
	{
		String str=new String("ABBBA");
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.compareTo("abbba"));

		System.out.println(str.substring(0,2));

	}
}*/
/*************************************REVERSE STRING PROGRAME***********************************************/

	public static void main(String args[])
	{
		//String x =" Raj chaudhari";
		String x ="radar";

		char y[]=x.toCharArray();
		int size = y.length;
		char a[]=new char[size];
		int i=0;
		while(i!=size)
		{
			//a[i]=y[i];//COPY STRING//
			a[size-1-i]=y[i];//REVERSE STRING//
			++i;
		}
		//palindrome logic
		i=0;
		while(i!=size)
		{
			if(a[i]!=y[i])
			{
				System.out.println("Not a palindrome");
				System.exit(0);
	
			}
			else
			{
				++i;
				continue;
			}
			
		}
		System.out.println("Palindrome");

		//System.out.println(y);
		//System.out.println(a);

	}

	
	
}