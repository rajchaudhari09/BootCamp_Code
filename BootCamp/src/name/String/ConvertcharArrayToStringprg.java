package name.String;

public class ConvertcharArrayToStringprg 
{

	public static void main(String args[])
	{
		//declaring string
		String str="raj";
		
		char[] charArr=new char[] {'R','A','J'};
		
		//convert char array to string
		str = new String(charArr);
		
		//removing last element
		
		//print string
		System.out.println("str="+str);
	}
}
