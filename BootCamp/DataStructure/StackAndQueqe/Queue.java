package StackAndQueqe;

public class Queue

{
	int Queue[]=new int[5];
	int size;
	int front;
	int rear;
	public static void main(String args[]) 
		
	{
		Queue q=new Queue();
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(6);
		q.enQueue(9);
		q.enQueue(7);
		q.deQueue();
		q.deQueue();
		q.enQueue(10);
		q.enQueue(50);
		q.show();
		
		
	}
	public void enQueue(int data)
	{
		Queue[rear]=data;
		rear=(rear+1)%5;
		size=size+1;
	}
	public void deQueue()
	{
		@SuppressWarnings("unused")
		int data=Queue[front];
		front=(front+1);
		size=size-1;
	}
	public void show()
	{
		System.out.print("Elements : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(Queue[(front+i)%5] + " ");
		}
		System.out.println(" ");
		for(int n: Queue)
		{
			System.out.print( n+ " ");
		}
	}
	
}
