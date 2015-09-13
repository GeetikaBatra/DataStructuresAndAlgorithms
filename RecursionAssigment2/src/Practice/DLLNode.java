package Practice;

public class DLLNode<T> {
	
	T data;
	DLLNode<T> Prev;
	DLLNode<T> Next;
	
	public DLLNode(T data)
	{
		this.data=data;
		Prev=null;
		Next=null;
	}
	
	

}
