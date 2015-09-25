package Practice;

import java.util.Scanner;

public class DoublyLinkedList<T> {
	
	public static DLLNode<Integer> generatingDLL()
	{
		System.out.println("Enter the elements");
		Scanner s = new Scanner(System.in);
		int data=s.nextInt();
		if(data==-1)
			{
			return null;
			}
			DLLNode<Integer> head= new DLLNode<Integer>(null);
			
			head.Prev=null;
			head.Next=null;
			DLLNode<Integer> tail=head;
			
			while(data!=-1)
			{
				if(head.data==null)
				{
					head.data=data;
				}
				else
				{
				DLLNode<Integer> temp = new DLLNode<Integer>(data);
				temp.Next=null;
				temp.Prev=tail;
				tail.Next=temp;
				tail=temp;
				}
				data=s.nextInt();
			}
			return head;
	}
	public static void printDLL(DLLNode<Integer> head)
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		DLLNode<Integer> current = head;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.Next;
		}
		
		
		
		
	}
	public static int returnAtPos(int pos, DLLNode<Integer> head)
	{
		DLLNode<Integer> current=head;
		while(pos!=0)
		{   
			if(current.Next==null)
			{
				break;
			}
				
			current=current.Next;
			pos--;
			
		}
		return current.data;
	}
	public static int returnValueAt(int value, DLLNode<Integer> Head)
	{
		
		DLLNode<Integer> current = Head;
		int pos=0;
		while(current!=null)
		{
			if(current.data==value)
			{
				return pos;
			}
			current=current.Next;
			pos++;
		}
		return Integer.MIN_VALUE;
	}

	public static int length(DLLNode<Integer> head)
	{
		if(head==null)
		{
			return 0;
		}
		int pos=0;
		DLLNode<Integer> current = head;
		while(current!=null)
		{
			pos++;
			current=current.Next;
		}
		return pos;
	}
	
	public static DLLNode<Integer> InsertBegin(DLLNode<Integer> head, int value)
	{
		DLLNode<Integer> temp = new DLLNode<Integer>(value);
		if(head==null)
		{
			temp.Next=null;
			temp.Prev=null;
			return temp;
		}
		head.Prev=temp;
		temp.Next=head;
		temp.Prev=null;
		head=temp;
		return head;
	}
	public static DLLNode<Integer> insertMid(int pos, DLLNode<Integer> head, int value)
	{
		
		
		DLLNode<Integer> current = head;
		DLLNode<Integer> temp=new DLLNode<Integer>(value);
		if(head==null)
		{
			return temp;
		}
		if(pos==0)
		{
			return InsertBegin(head,value);
			
		}
		
		while(pos!=1)
		{
			if(current.Next==null)
			{
				break;
			}
			current=current.Next;
			pos--;
		}
		
		DLLNode<Integer> next=current.Next;
		if(next==null)
		{
			current.Next=temp;
			temp.Prev=next;
			return head;
		}
		current.Next=temp;
		temp.Prev=current;
		
		
		temp.Next=next;
		next.Prev=temp;
		
		return head;
		
		
	}
	public static DLLNode<Integer> removeByNode(DLLNode<Integer> node, DLLNode<Integer> head)
	{
		if(head==null)
		{
			
			return null;
		}
		if(head.Next==null)
		{
			if(node.equals(head))
			{
				return null;
			}
			return head;
		}
		DLLNode<Integer> current = head;
		
		while(!node.equals(current))
		{
			if(current==null)
			{
				return null;
			}
			current=current.Next;
		}
		current.Prev.Next=current.Next;
		current.Next.Prev=current.Prev;
		return head;
	}
	public static DLLNode<Integer> removal(DLLNode<Integer> head, int pos)
	{
		if(pos<=0)
		{
			return head.Next;
		}
		DLLNode<Integer> current =head;
		while(pos!=1)
		{
			if(current.Next.Next==null)
			{
				break;
			}
			current=current.Next;
			pos--;
		}
		DLLNode<Integer> next=current.Next.Next;
		if(next==null)
		{
			current.Next=null;
			return head;
		}
		current.Next=next;
		next.Prev=current;
		return head;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLLNode<Integer> head = generatingDLL();
		DLLNode<Integer> node= new DLLNode<Integer>(3);
		printDLL(removeByNode(node,head));
		//System.out.println(length(head));
		
		//System.out.println(returnAtPos(10, head));
	//	int ValueAt=returnValueAt(6,head);
//		if(ValueAt==Integer.MIN_VALUE)
//		{
//			System.out.println("Value not found");
//			
//		}
//		else
//		{
//			System.out.println(ValueAt);
//		}
		
		//printDLL(head);

	}

}
