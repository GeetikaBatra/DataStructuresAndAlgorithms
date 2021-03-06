package DataStructures;

public class Queue2Stacks {
	
	StackUsingLinkedList s1= new StackUsingLinkedList();
	StackUsingLinkedList s2= new StackUsingLinkedList();
	public int size() {
		if(s1.size()==0 && s2.size()==0)
		{
			return 0;
		}
		else if(s1.size()!=0)
		{
			return s1.size(); 
		}
		else
		{
			return s2.size();
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
	public int front() throws StackEmptyException 
	{
		try
		{
			if(!s1.isEmpty())
		
		{
			int size=s1.size();
			for(int i=0;i<size;i++)
			{
				s2.push(s1.pop());
			}
		}
		return s2.top();
		}
		catch(StackEmptyException e)
		{
			throw e;
		}
	}
	public void enqueue(int data) throws StackEmptyException
	
	{
		if(s1.isEmpty() && s2.isEmpty())
		{
			s1.push(data);
		}
		else if(!s2.isEmpty() && s1.isEmpty())
		{
			int size=s2.size();
			try
			{
			for(int i=0;i<size;i++)
			{
				s1.push(s2.pop());
			}
			}
			catch(StackEmptyException e)
			{
				//not needed
			}
			s1.push(data);
			
		}
		else
			
		{
			s1.push(data);
			
		}
		
	}
	public int dequeue() throws queueEmptyException, StackEmptyException
	{
		if(s1.isEmpty() && s2.isEmpty())
		{
			queueEmptyException e = new queueEmptyException();
			throw e;
		}
		try
		{
			if(s2.isEmpty())
			{
				int size=s1.size();

				for(int i=0;i<size;i++)
				{
					s2.push(s1.pop());
				}


			}
			return s2.pop();

		}
		catch(StackEmptyException e)
		{
			throw e;
		}

	}
}

