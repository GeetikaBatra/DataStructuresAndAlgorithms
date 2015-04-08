package DataStructures;

public class Stack2Queues {
	QueueUsingLL<Integer> q1 ;
	QueueUsingLL<Integer> q2 ;
	public Stack2Queues(QueueUsingLL<Integer> q1 ,QueueUsingLL<Integer> q2)
	{
		this.q1 = q1;
	    this.q2 = q2;
		
		
	}
	
	public int size() {
		if(q1.size()==0)
		{
			return 0;
		}
		else
		{
			return q1.size(); 
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
		q1.enqueue(data);
		
	}
	public int pop() throws queueEmptyException
	{
		int size=q1.size()-1;
		for(int i=0;i<size;i++)
		{
			q2.enqueue(q1.dequeue());
		}
		int element= q1.dequeue();
		QueueUsingLL<Integer> temp;
		temp=q1;
		q1=q2;
		q2=temp;
		return element;
		
	}
	
	
}
