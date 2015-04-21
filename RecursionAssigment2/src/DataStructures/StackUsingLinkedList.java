package DataStructures;

public class StackUsingLinkedList<T> {
	private	node<T> head=null;
	private int lastIndex=0;
	
	public  int size()
	{
		return lastIndex;
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
	public T top() throws StackEmptyException
	{
		if(isEmpty())
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return head.data;
	}
	public void push(T data)
	{  
		node<T> temp = new node<T>();
		temp.data=data;
		
//		if(head==null)
//		{
//			head=temp;
//			head.next=null;
//		
//		}
//		else
//		{
//			temp.next=head;;
//			head=temp;
//			
//		}
		temp.next=head;
		head=temp;
		
		lastIndex++;
	}
	public T pop() throws StackEmptyException
	{  
		if(isEmpty())
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		T data = head.data;
		head=head.next;
		lastIndex--;
		
		return data;
		
	}
}
