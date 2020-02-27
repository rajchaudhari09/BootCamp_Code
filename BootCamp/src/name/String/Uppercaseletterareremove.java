package name.String;

public class Uppercaseletterareremove 
{

	private static String move(String str) 
	{
		int len= str.length();
		String low="";
		String upr="";
		char ch = 0;
		for(int i=0;i<len;i++)
		{
			ch = str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				upr+=ch;
			}
			else
			{
				low+=ch;
			}
		}// TODO Auto-generated method stub
		return low+upr;
	}
	
	
	public static void main(String args[])
	{
		String str="My Self is Raj Ambalal Chaudhari And m From Gujarat";
		System.out.println("before operation : "+str);
		System.out.println("after remove uppercase letter the operation :"+move(str));
	}


}
