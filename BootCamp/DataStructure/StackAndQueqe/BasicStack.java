/**
 * 
 */
/**
 * @author RAJ
 *
 */
package StackAndQueqe;

import java.util.Stack;

public class  BasicStack
{
	static final int max=2000;
	int top;
	int a[]=new int[max];
	//Isempty method
	boolean isEmpty()
	{
		return(top<0);
		
	}
	BasicStack()
	{
		top=-1;
		
	}
	//push operation is perform that the method
	boolean push(int x)
	{
		if(top>=(max-1))
		{
			System.out.println("Stack overflow");
			return false;
		}
		else
		{
			System.out.println(x+"push into the Stack");
			return true;
		}
		
	}
	//pop operation is perform that the method
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else
		{
			int x=a[top-1];
			return x;
			
		}
		
	}
	//peek operation is perform that the method
	int peek()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return 0;
			
		}
		else
		{
			int x=a[top];
			return x;
		}
	}
	//main function declare in the stack
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[])
	{
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop()+ "-POP from the Stack");
	}
	
}