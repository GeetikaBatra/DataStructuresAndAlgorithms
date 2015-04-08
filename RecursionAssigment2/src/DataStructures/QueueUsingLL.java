package DataStructures;

public class QueueUsingLL<T> 
{
	private	node<T> head=null;
	private node<T> tail=head;
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
	public T front() throws queueEmptyException
	{
		if(isEmpty())
		{
			queueEmptyException e = new queueEmptyException();
			throw e;
		}
		return head.data;
	}
	public void enqueue(T data)
	{  
		node<T> temp = new node<T>();
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
	public T dequeue() throws queueEmptyException
	{  
		if(isEmpty())
		{
			queueEmptyException e = new queueEmptyException();
			throw e;
		}
		T data = head.data;
		head=head.next;
		size--;
		
		return data;
		
	}
}
