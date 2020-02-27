package Set1;

import java.util.Scanner;

public class Rev_Stack
{
	static Node head=null;
	class node
	{
		int data;
		Node next;
		node(int data1)
		{
			data=data1;
			next=null;
		}
	}
	public static void put(int data) 
	{
		Node n1=new Node(data);
		n1.next=head;
		head=n1;
	}
	public static void print() 
	{
		Node curr=head;
		Node top=null;
		Node temp=head;
		while(temp!=null) 
		{
			temp=curr.next;
			curr.next=top;
			top=curr;
			curr=temp;
		}
		while(top!=null) 
		{
			System.out.println(top.data);
			top=top.next;
		}
	}
	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String args[]) 
	{
		 Rev_Stack rs=new  Rev_Stack();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		System.out.print("Enter the vales: ");
		for(int i=0;i<n;i++) 
		{
			rs.put(sc.nextInt());
		}
		rs.print();
	}
}
