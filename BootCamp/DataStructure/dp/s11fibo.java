package dp;

public class s11fibo
{
	public static Node head= null;
	public Node tail= null;
	 
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
	public static void main(String args[])
	{
		s11fibo fb=new s11fibo();
		
		fb.fibo();
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
	private void fibo() 
	{
		Node n1,n2;
		Node temp;
		n1=head;
		for(int i=0;i<10;i++)
		{
			Node node = new Node(i);
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
