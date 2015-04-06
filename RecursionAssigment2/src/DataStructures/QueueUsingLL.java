package DataStructures;

public class QueueUsingLL 
{
	private	node<Integer> head=null;
	private node<Integer> tail=head;
	private int size=0;
	public  int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		if(size()==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int front() throws queueEmptyException
	{
		if(isEmpty())
		{
			queueEmptyException e = new queueEmptyException();
			throw e;
		}
		return head.data;
	}
	public void enqueue(int data)
	{  
		node<Integer> temp = new node<Integer>();
		temp.data=data;
		
		if(head==null)
		{
			head=temp;
			tail=temp;
		}
		else
		{
			tail.next=temp;
			tail=tail.next;
			
		}
		
		
		size++;
	}
	public Integer dequeue() throws queueEmptyException
	{  
		if(isEmpty())
		{
			queueEmptyException e = new queueEmptyException();
			throw e;
		}
		int data = head.data;
		head=head.next;
		size--;
		
		return data;
		
	}
}
