package day1lang;

public class GFG {
	/*static String wordReverse(String str)
	{
		int i= str.length()-1;
		int start,end=i+1;
		String result="";
		
		while(i>=0)
		{
			if(str.charAt(i)=='3')
			{
				start=i+1;
				while(start!=end)
					result+=str.charAt(start++);
				result+='3';
				end=i;
			}
			i--;
		}
		start=0;
		while(start!=end)
			result+=str.charAt(start++);
		return result;
	}*/
	public static void main(String[] args)
	{
		String str="RAJ VIPUL DHANRAJ sam new";
		//System.out.println(wordReverse(str));
		String arr[]=str.split(" ");
		str="hi ";
		for(int i=0;i<=2;i++)
		{
		 str+=arr[arr.length-1-i]+" ";	
		}
		System.out.println(str);
		
		
		
	}
	
}
