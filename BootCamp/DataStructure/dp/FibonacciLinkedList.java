package dp;
 import java.util.LinkedList;
 @SuppressWarnings("serial")

 public class FibonacciLinkedList extends LinkedList<Integer>
 {
	 //main method
	 public static void main(String args[])
	 {
		 FibonacciLinkedList list=new FibonacciLinkedList(10);
		 list.display();
	 }
	 //display method
	 public void display()
	 {
		 System.out.println(this.toString());
	 }
	//fibonacci logic
	 public FibonacciLinkedList(int n)
	 {
		 int a=0,b=0,c=1;
		 for(int i=1;i<=n;i++)
		 {
			 a=b;
			 b=c;
			 c=a+b;
			 this.add(c);
		 }
	 }
	
 }