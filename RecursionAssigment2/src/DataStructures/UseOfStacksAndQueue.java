package DataStructures;

public class UseOfStacksAndQueue {

	public static void main(String[] args) throws StackEmptyException, queueEmptyException {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		int i;
		QueueUsingLL q1 = new QueueUsingLL();
		QueueUsingLL q2 =new QueueUsingLL();
		Stack2Queues s= new Stack2Queues(q1,q2);
		//StackUsingLinkedList s = new StackUsingLinkedList();
//		StackUsingLinkedList s2= new StackUsingLinkedList();
//		
		for(i=0;i<a.length;i++)
		{
			s.push(a[i]);
		}
//	    StackReverseStack.transfer(s,s2);
	    
//		try
//		{
//			System.out.println(s.top());
//
//		}
//		catch(StackEmptyException e)
//		{
//			throw e;
//		}
		System.out.println(s.size());

//		try
//		{  
		int size=s.size();
			for( i=0;i<size;i++)
			{
				System.out.println(s.pop());
			}

//		}
//		catch(StackEmptyException e)
//		{
//			throw e;
//		}
		//Queue2Stacks q= new Queue2Stacks();
//		QueueUsingLL q = new QueueUsingLL();
//		for(i=0;i<a.length;i++)
//		{
//			q.enqueue(a[i]);
//		}
//		try
//		{
//			System.out.println(q.front());
//
//		}
//		catch(queueEmptyException e)
//		{
//			throw e;
//		}
//		q=ReversingQueue.reverse(q);
//		try
//		{
//			int size=q.size();
//			for( i=0;i<size;i++)
//			{
//				System.out.println(q.dequeue());
//			}
//
//		}
//		catch(queueEmptyException e)
//		{
//			throw e;
//		}
	
		
		
	}
}



