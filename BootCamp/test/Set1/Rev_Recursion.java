package Set1;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}
 class Rev_Recursion 
{
	 public static void printlist(Node head) 
	 {
		 Node ptr=head;
		 while(ptr!=null) 
		 {
			 System.out.print(ptr.data+ " ----> ");
			 ptr=ptr.next;
		 }
		 System.out.println("null");
	 }
	 public static Node push(Node head,int data) 
	 {
		 Node node=new Node(data);
		 node.next=head;
		 return node;
	 }
	 public static Node reverse(Node curr,Node prev,Node head) 
	 {
		 if(curr==null) 
		 {
			 head=prev;
			 return head;
		 }
		 head=reverse(curr.next,curr,head);
		 curr.next=prev;
		 return head;
	 }
	 public static Node reverse(Node head) 
	 {
		 return reverse(head,null,head);
	 }
	 public static void main(String args[]) 
	 {
		// System.out.println();
		 int[]keys= {1,2,3,4,5,6,7,8,9};
		
		 Node head=null;
		 for(int i=keys.length-1;i>=0;i--) 
		 {
			 head=push(head,keys[i]);
		 }
		 head=reverse(head);
		 printlist(head);
	 }
}
