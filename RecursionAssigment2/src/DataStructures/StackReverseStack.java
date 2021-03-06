package DataStructures;

public class StackReverseStack {
	
	public static StackUsingLinkedList reverse(StackUsingLinkedList s,StackUsingLinkedList s1) throws StackEmptyException
	{
		if (s.size() ==0 ) {
			return s1;
		}
		
		int element = s.pop();
		
		s1=reverse(s,s1);
		s1.push(element);
		 return s1;
		
	}
	public static void transfer(StackUsingLinkedList s,StackUsingLinkedList s1) throws StackEmptyException
	{
		s1=reverse(s,s1);
		int size=s1.size();
		for(int i=0;i<size;i++)
		{
			s.push(s1.pop());
		}
	}

}
