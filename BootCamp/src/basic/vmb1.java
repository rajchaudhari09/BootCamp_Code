package basic;

public class vmb1
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
public static class staticvmb1
{
	public static void main(String args[])
	{
		System.out.println("main method");
			System.out.println(vmb1.a);
	//	display();

	}
}
}