package dp;

import dp.doublyfib.Node;

@SuppressWarnings("unused")
public class doublyfib
{
	public static Node head= null;
	public Node tail= null;
	 
	public class Node
	{
		int data;
		Node next;
		Node prev;
		 
		public Node(int data)
		{
			this.data=data;
			this.next=null;
			this.prev=null;
		}
}
	public static void main(String args[])
	{
		doublyfib fb=new doublyfib();
		
		fb.fibo(0);
		fb.display();
	}
	private void display() 
	{
		Node current = head;
		
		if(head==null)
		{
			System.out.println("list is empty: ");
			return;
		}
		while(current!=null)
		{
			System.out.println(current.data+"");
			current=current.next;
		}
		System.out.println();
	}
	//@SuppressWarnings("null")
	private void fibo(int n) 
	{
		Node n1,n2 = null;
		Node temp;
//	 Node node1=null; 
		
		n1=head;
		n=10;
		for(int i=0;i<n;i++)
		{
			Node node = new Node(n);
			node.next=null;
			if(i<2) 
			{
				node.data=i;
				if(head==null)
				{
					head=node;
				}
				else
				{
					temp=head;
					//node.data=n1.data+n2.data;
					temp.next=node;
					n1=head;
					/*n2=n1.next;
					
					node.data=n1.data+n2.data;
					n2.next=node;
					n1=n2;*/
				}
			}
		}
	}
}
