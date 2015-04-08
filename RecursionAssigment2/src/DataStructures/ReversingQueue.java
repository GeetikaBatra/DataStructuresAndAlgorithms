package DataStructures;

public class ReversingQueue {
	public static QueueUsingLL<Integer> reverse(QueueUsingLL<Integer> q) throws queueEmptyException
	{
		if (q.size() == 0) {
			return q;
		}
		int element = q.dequeue();
//		if(q.size()==0)
//		{
//			q.enqueue(element);
//			return q;
//		}
		 reverse(q).enqueue(element);
		 return q;
		
		
	}
	
}
