package Set2;

//import org.w3c.dom.Node;
class Node
{
	int data;
	Node next;
	public Node(int data) 
	{
		this.data=data;
	}
	
}
public class Circular_LL 
{
	public int size=0;
	public Node head=null;
	public Node tail=null;
	//add anew node at the start of the ll
	
	public void addNodeAtStart(int data) 
	{
		System.out.println("Adding node"+data+"at start");
		Node n=new Node(data);
		if(size==0) 
		{
			head=n;
			tail=n;
			n.next=head;
		}
		else 
		{
			Node temp=head;
			n.next=temp;
			head=n;
			tail.next=head;
		}
		size++;
	}
	
	////add anew node at the end of the ll
	public void addNodeAtEnd(int data) 
	{
		if(size==0)
		{
		
			addNodeAtStart(data);
		}
		else 
		{
			Node n=new Node(data);
			tail.next=n;
			tail=n;
			tail.next=head;
			size++;
		}
		System.out.println("\nNode"+data+"is added the end the list");
		}
	//delete a new node at the start of the ll
	public void deleteNodeFromStart() 
	{
		if(size==0) 
		{
			System.out.println("\nList is empty");
		}
		else 
		{
			System.out.println("\ndeleting node"+head.data+"from start");
			head=head.next;
			tail.next=head;
			size--;
		}
	}
	//Search an element in ll
	public void search(int data) 
	{
		Node current=head;
		int i=1;
		boolean flag=false;
		
		if(head==null) 
		{
			System.out.println("List is empty");
		}
		else 
		{
			do {
				if(current.data==data) 
				{
					flag=true;
					break;
				}
				current=current.next;
				i++;
			}
			while(current!=head);
			if(flag)
				System.out.println("data is present in the list at position: "+i);
			else
				System.out.println("data is not present in the list at position: "+i);
		}
	}
	
	public int elementAt(int index) 
	{
		if(index>size) 
		{
			return -1;
		}
		Node n=head;
		while(index-1!=0) 
		{
			n=n.next;
			index--;
		}
		return n.data;
	}
	//print the ll
	public void print() 
	{
		System.out.println("Circular Link List");
		Node temp=head;
		if(size<=0) 
		{
			System.out.println("List is empty");
		}
		else 
		{
			do 
			{
				System.out.println(""+temp.data);
				temp=temp.next;
			}
			while(temp!=head);
		}
		System.out.println();
	}
	//get size
	public int getSize() 
	{
		return size;
	}
	public static void main(String args[]) 
	{
		Circular_LL cll=new Circular_LL();
		cll.addNodeAtStart(3);
		cll.addNodeAtStart(2);
		cll.addNodeAtStart(1);
		cll.print();
		cll.deleteNodeFromStart();
		cll.print();
		cll.addNodeAtEnd(4);
		cll.print();
		cll.search(2);
		cll.search(7);
		System.out.println("Size of linked list: "+cll.getSize());
		System.out.println("Element at 2nd position: : "+cll.elementAt(2));
	}
}
