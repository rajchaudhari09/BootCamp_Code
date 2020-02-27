package test6;

import java.util.Scanner;
 class LinkedList
{
	 public class Node
	 {
		 int data;
		 Node next=null;
		 Node(int data)
		 {
			 this.data=data;
		 }
	 }
	 Node head=null;
	 
	 public void add(int data) 
	 {
		 Node newNode=new Node(data);
		 if(head==null)
			 head=newNode;
		 else 
		 {
			 Node temp=head;
			 while(temp.next!=null)
				 temp=temp.next;
			 temp.next=newNode;
		 }
	 }
	 public boolean search(int data) 
	 {
		 Node temp=head;
		 while(temp!=null) 
		 {
			 if(temp.data==data)
				 return true;
			 temp=temp.next;
		 }
		return false;
	 }
	 public void display()
	 {
		 Node temp=head;
		 while(temp!=null) 
		 {
			 System.out.print(temp.data+" ");
			 temp=temp.next;
		 }
		 System.out.println();
	 }
	 
}
 class Hashing_T
 {

	public static void main(String[] args) 
	 {
		 int i,no,mod,op;
		 LinkedList ll[]=new LinkedList[11];
		 for(i=0;i<11;i++)
			 ll[i]=new  LinkedList();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("1.adding 2.view 3.search");
		 do 
		 {
			
			op=sc.nextInt();
			if(op==4)
				break;
			switch(op){
			case 1: 
				System.out.print("Enter number: ");
				no=sc.nextInt();
				mod=no%i;
				ll[mod].add(no);
				break;
			case 2: 
				for(i=0;i<11;i++) 
				{
					System.out.println("Slot"+(i+1)+":");
					ll[i].display();
				}
				break;
			case 3: 
				System.out.print("Enter number: ");
				no=sc.nextInt();
				mod=no%i;
				if(ll[mod].search(no)) 
					System.out.println("Value found in table");
				else
					System.out.println("Value not found in table");
			
			} 
		 }while(true);
		 sc.close();
	 }
 }