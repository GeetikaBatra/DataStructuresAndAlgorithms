package DataStructures;

public class Stack2Queues {
	QueueUsingLL q1 = new QueueUsingLL();
	QueueUsingLL q2 = new QueueUsingLL();
	
	public QueueUsingLL reverse(QueueUsingLL q) throws queueEmptyException
	{
		if (q.size() == 0) {
			queueEmptyException e = new queueEmptyException();
			throw e;
		}
		int element = q.dequeue();
		if(q.size()==0)
		{
			q.enqueue(element);
			return q;
		}
		 reverse(q).enqueue(element);
		 return q;
		
		
	}
	public int size() {
		if(q1.size()==0 && q2.size()==0)
		{
			return 0;
		}
		else if(q1.size()!=0)
		{
			return q1.size(); 
		}
		else
		{
			return q2.size();
		}
		
		
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
	public void push(int data) throws queueEmptyException
	{
		if(q1.isEmpty() && q2.isEmpty())
		{
			q1.enqueue(data);
		}
		else if(!q2.isEmpty())
		{
			q1=reverse(q2);
			q1.enqueue(data);
		}
		else
		{
			q1.enqueue(data);
		}
		
	}
	public int pop() throws StackEmptyException
	{
		if(q1.isEmpty() && q2.isEmpty())
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		else if(!q1.)
	}
	
	
}
