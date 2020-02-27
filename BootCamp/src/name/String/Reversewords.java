package name.String;

public class Reversewords 
{
	public static void main(String[] args)
	{
		String str="my RAJ VIPUL DHANRAJ VARSHA.";
		//System.out.println(wordReverse(str));
		String arr[]=str.split(" ");
		str="Hi:_: ";
		for(int i=0;i<=2;i++)
		{
		 str+=arr[arr.length-1-i]+" ";	
		}
		System.out.println(str);
		
		
		
	}
}
