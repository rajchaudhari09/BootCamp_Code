package LinkedList;

public class Findmidvalue 
{
	public static void main(String args[])
	{
		LinkedList linkedList = new LinkedList();
		LinkedList.Node head = LinkedList.head();
		LinkedList.add(new LinkedList.Node("1"));
		LinkedList.add(new LinkedList.Node("2"));
		LinkedList.add(new LinkedList.Node("3"));
		LinkedList.add(new LinkedList.Node("4"));
		LinkedList.add(new LinkedList.Node("5"));
		
		LinkedList.Node current=head;
		int length=0;
		LinkedList.Node middle=head;
		
		while(current.next()!=null)
		{
			length++;
			if(length%2==0)
			{
				middle=middle.next();
			}
			current=current.next();
		}
		if(length%2==1)
		{
			middle=middle.next();
		}
		System.out.println("length of LinkedList: "+length);
		System.out.println("middle element of LinkedList :" +middle);
	}
}
class LinkedList
{
	private static Node head;
	private static Node tail;
	
	public LinkedList()
	{
		this.head=new Node("head");
		tail=head;
	}
	public static Node head()
	{
		return head;
	}
	public static void add(Node node)
	{
		tail.next=node;
		tail=node;
	}
	public static class Node
	{
		private Node next;
		private String data;
		
		public Node(String data)
		{
			this.data=data;
		}
		public String data()
		{
			return data;
		}
		public void setData(String data)
		{
			this.data=data;
		}
		public Node next()
		{
			return next;
		}
		public void setNext(Node next)
		{
			this.next=next;
		}
		public String toString()
		{
			return this.data;
		}
	}

}