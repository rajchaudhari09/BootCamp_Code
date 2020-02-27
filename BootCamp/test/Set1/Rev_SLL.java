package Set1;

public class Rev_SLL
{
	Node head;
	public static class Node
	{
		int data;
		Node next;
		Node(int data,Node next)
		{
			this.data=data;
			this.next=next;
		}
	}
	public static void main(String args[]) 
	{
		Rev_SLL rs=new Rev_SLL();
		Node first=new Node(1,null);
		Node second=new Node(2,null);
		Node third=new Node(3,null);
		rs.head=first;
		first.next=second;
		second.next=third;
		rs.printlist();
		rs.reverselist();
		rs.printlist();
	}
	private void reverselist()
	{
		Node current=head;
		Node prev=null;
		Node nextnode=null;
		while(current!=null) 
		{
			nextnode=current.next;
			current.next=prev;
			prev=current;
			current=nextnode;
		}		
		head=prev;
	}
	private void printlist() 
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data);
			n=n.next;
		}
		System.out.println();
		
	}
	
}
