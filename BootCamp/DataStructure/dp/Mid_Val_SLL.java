package dp;

import java.util.LinkedList;

//import LinkedList.Node;

public class Mid_Val_SLL 
{

	@SuppressWarnings("rawtypes")
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.mid();
		list.display();

	}
	
	
	public static Node Head=null;
	public Node Tail=null;
	public class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}

	public void mid()
	{
		Node current=Head;
		Node mid=Head;
		int length=0;
		while(current.next!=null)
		{
			length++;
			if(length%2==0)
			{
				mid=mid.next;
			}
			current=current.next;
		}
		if(length%2==1)
			mid=mid.next;
	}

	public void add(int data)
	{
		Node newNode=new Node(data);
		if(Head==null)
		{
			Head=newNode;
			Tail=newNode;

		}
		else
		{
			Tail.next=newNode;
			Tail=newNode;
		}
	}

	public void display()
	{
		Node current=Head;
		if(Head==null)
		{
			System.out.println("List is Empty.");
			return;
		}
		while(current!=null)
		{
			System.out.println(current.data+"");
			current=current.next;
		}
		System.out.println();
	}
}
