package CircularLinkedList;

public class CLLNode {
	
	int data;
	CLLNode next;
//	CLLNode Head=null;
//	CLLNode Tail=null;

	public CLLNode()
	{
		next=null;
		data = Integer.MIN_VALUE;
	}
	
	public int getData()
	{
		return data;
	}
	public void setData(int data)
	{
		this.data=data;
	}
	
	public CLLNode getNext()
	{
		return next;
	}
	public void setNext(CLLNode next)
	{
		this.next=next;
	}
}

