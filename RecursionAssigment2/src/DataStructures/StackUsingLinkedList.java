package DataStructures;

public class StackUsingLinkedList {
	private	node<Integer> head=null;
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
	public int top() throws StackEmptyException
	{
		if(isEmpty())
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return head.data;
	}
	public void push(int data)
	{  
		node<Integer> temp = new node<Integer>();
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
	public Integer pop() throws StackEmptyException
	{  
		if(isEmpty())
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int data = head.data;
		head=head.next;
		lastIndex--;
		
		return data;
		
	}
}