package basic;

public class staticvmb 
{
	static int a=10;//static variable
	static void display()//static method
	{
		System.out.println("static method");
	}
	static//static block
	{
		System.out.println("static block");
		
	}
	public static void main(String args[])
	{
		System.out.println("main method");
		System.out.println(a);
		display();

	}
}
