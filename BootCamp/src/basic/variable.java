package basic;

public class variable {
	int a=10;//INSTANCE VARIABLE (after a class nd before the main method can declare a variable is called as instance vriable)//
	static int c=30;//STATIC VARIABLE(memory alloted only once//declared using static keyword//directly access)//
	public static void main(String args[]){
		int b=20;//LOCAL VARIABLE (*within a method//direct access)//
		variable v=new variable();
		System.out.println("INSTANCE VARIABLE="+v.a);
		System.out.println("LOCAL VARIABLE="+b);
		System.out.println("STATIC VARIABLE="+c);
	}

}
