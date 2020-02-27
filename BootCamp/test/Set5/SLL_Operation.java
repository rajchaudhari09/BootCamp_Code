package Set5;

import java.util.Scanner;

class Node
{
	private int data;
	private Node next;

	public Node() 
	{
		data=0;
		next=null;
	}
	public Node(int d,Node n) 
	{
		data=d;
		next=n;
	}
	
	public void setData(int d) 
	{
		data=d;
	}
	public void setNext(Node n) 
	{
		next=n;
	}
	public int getData() 
	{
		return(data);
	}
	public Node getNext() 
	{
		return(next);
	}
}
class LinkedList1
{
	private int size;
	private Node start;
	public LinkedList1() 
	{
		size=0;
		start=null;
	}
	public void insertAtFirst(int val) 
	{
		Node n;
		n=new Node();
		n.setData(val);
		n.setNext(start);
		start=n;
		size++;
	}
	public void insertAtLast(int val) 
	{
		Node n,t;
		n=new Node();
		n.setData(val);
		t=start;
		if(t==null) 
			start=n;
		else
		{
			while(t.getNext()!=null)
				t=t.getNext();
			t.setNext(n);
		}
		size++;
	}
	public void insertAtPos(int val,int pos) 
	{
		if(pos==1)
			insertAtFirst(val);
		else if(pos==size+1)
			insertAtLast(val);
		else if(pos>1&&pos<=size)
		{
			Node n,t;
			n=new Node(val,null);
			t=start;
			for(int i=1;i<pos-1;i++)
				t=t.getNext();
			n.setNext(t.getNext());
			t.setNext(n);
			size++;
		}
		else 
		{
			System.out.println("Insertion not possible at this pos"+pos);
		}

	}
	public void deleteAtPos(int pos) 
	{
		if(start==null)
			System.out.println("List is Already empty");
		else if(pos<1||pos>size)
			System.out.println("Invalid position");
		else if(pos==1)
			deleteAtFirst();
		else if(pos==size)
			insertAtLast();
		else
		{
			Node t,t1;
			//n=new Node(val null);
			t=start;
			for(int i=1;i<pos-1;i++)
				t=t.getNext();
			t1=t.getNext();
			//n.setNext(t1.getNext());
			t.setNext(t1.getNext());
			size--;
		}

	}
	public void insertAtLast()
	{
		if(start==null)
			System.out.println("list is empty");
		else if(size==1) 
		{
			start=null;
			size--;
		}
		else 
		{
			Node t;
			t=start;
			for(int i=1;i<size-1;i++)
				t=t.getNext();
			t.setNext(null);
			size--;
		}

	}
	public void deleteAtFirst() 
	{
		if(start==null)
			System.out.println("List is already empty");
		else 
		{
			start=start.getNext();
			size--;
		}

	}
	public boolean isEmpty() 
	{
		if(start==null)
			return(true);
		else
			return(false);
	}
	public int getListSize() 
	{
		return(size);
	}
	public void viewList() 
	{
		Node t;
		if(isEmpty())
			System.out.println("list is Empty");
		else 
		{
			t=start;
			for(int i=1;i<=size;i++) 
			{
				System.out.println(""+t.getData());
				t=t.getNext();
			}
		}
	}

}

public class SLL_Operation 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		SLL_Operation sllo=new SLL_Operation();
		boolean flag=true;
		while(flag) 
		{
			System.out.println("");
			System.out.println("1.Add item to the list at start");
			System.out.println("2.Add item to the list at last");
			System.out.println("3.Add item to the list at Position");
			System.out.println("4.Delete first item from the list ");
			System.out.println("5.Delete lastt item from the list");
			System.out.println("6.Delete at given position item from the list");
			System.out.println("7.View list");
			System.out.println("8.Exit");
			System.out.println("Enter the Choice");
			int choice=sc.nextInt();
			int position,val;
			switch(choice) 
			{
				case 1:
					System.out.println("Enter value of list item");
					val=sc.nextInt();
					sllo.insertAtFirst(val);
					break;
				case 2:
					System.out.println("Enter value of list item");
					val=sc.nextInt();
					sllo.insertAtLast(val);
					break;
				case 3:
					System.out.println("Enter a Position");
					position=sc.nextInt();
					System.out.println("Enter value of list item");
					val=sc.nextInt();
					sllo.insertAtPos(val,position);
					break;
				case 4:
					sllo.deleteAtFirst();
					break;
				case 5:
					sllo.deleteAtLast();
					break;
				case 6:
					System.out.println("Enter a position");
					position=sc.nextInt();
					sllo.deleteAtPos(position);
					break;
				case 7:
					sllo.viewList();
					break;
				case 8:
					flag=false;
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
		
	}

	private void viewList() {
		// TODO Auto-generated method stub
		
	}

	private void deleteAtPos(int position) {
		// TODO Auto-generated method stub
		
	}

	private void deleteAtLast() {
		// TODO Auto-generated method stub
		
	}

	private void deleteAtFirst() {
		// TODO Auto-generated method stub
		
	}

	private void insertAtPos(int val, int position) {
		// TODO Auto-generated method stub
		
	}

	private void insertAtLast(int val) {
		// TODO Auto-generated method stub
		
	}

	private void insertAtFirst(int val) {
	
		
	}


}
