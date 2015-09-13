package Practice;

import java.util.Scanner;

public class LinkedList<T> {
	public static Node<Integer> generatingLL()
	{
		Node<Integer> Head=null;
		Node<Integer> LastNode=null;
		System.out.println("Enter the First Element");
		Scanner s=new Scanner(System.in);
		int input = s.nextInt();
		if(input==-1)
		{
			return null;
		}
		while(input!=-1)
		{
			Node<Integer> newNode= new Node<Integer>();
			newNode.data=input;
			newNode.next=null;
			if(Head==null)
			{
				Head=newNode;
				LastNode=newNode;
			}
			else
			{
				LastNode.next=newNode;
			}
			LastNode=newNode;
			System.out.println("Enter the next Element");
			input = s.nextInt();
		}
		
		return Head;
	}
	public static void printLL(Node<Integer> input)
	{
		if(input==null)
		{
			System.out.println(" null");
		}
		Node<Integer> current=input;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
		
	}
	public static Node<Integer> insert(Node<Integer> input, int data, int pos)
	{
		Node<Integer> current = input;
		Node<Integer> next = input;
		Node<Integer> newNode= new Node<Integer>();
		newNode.data=data;
		if(pos==0)
		{
			newNode.next=input;
			input=newNode;
		}
		else
		{
			while(pos!=1)
			{
				current=current.next;
				pos--;
			}
			next=current.next;
			current.next=newNode;
			newNode.next=next;
		}
		return input;
	}
	public static Node<Integer> deletion(Node<Integer> input, int pos) throws LinkedListEmptyException
	{
		if(input==null)
		{
			LinkedListEmptyException e = new LinkedListEmptyException();
			throw e;
		}
		if(input.next==null)
		{
			return null;
		}
		if(pos==0)
		{
			input=input.next;
			return input;
		}
		Node<Integer> current=input;
		Node<Integer> next;
		while(pos!= 1)
		{
			current=current.next;
			pos--;
			
		}
		next=current.next;
		current.next=next.next;
		return input;
	}
	public static Node<Integer> removeAndReturningHead(Node<Integer> input) 
	{
		if(input==null)
		{
			return null;
//			LinkedListEmptyException e = new LinkedListEmptyException();
//			throw e;
		}
		
		
//		Node<Integer> head = input;
//		head.next=null;
//		return head;
		Node<Integer> remove = input;
		Node<Integer> head =input;
		head=head.next;
		
		remove.next=null;
		printLL(head);
		
		
		return remove;
		
		
	}
	public static Node<Integer> removeAndReturnEnd(Node<Integer> input)
	{
		if(input==null)
		{
			return null;
//			LinkedListEmptyException e = new LinkedListEmptyException();
//			throw e;
		}
//		if(input.next==null)
//		{
//			return removeAndReturningHead(input);
//		}
		Node<Integer> head= input;
		Node<Integer> previous;
		while(head.next.next!=null)
		{
			head=head.next;
		}
		previous=head;
		head=head.next;
		previous.next=null;
		printLL(input);
		System.out.println("Working");
		return head;
		
		
	}
	public static Node<Integer> removeFromMiddle(Node<Integer> node, Node<Integer>  input)
	{
		if(input==null)
		{
			return null;
//			LinkedListEmptyException e = new LinkedListEmptyException();
//			throw e;
		}
		
		if(input.next==null)
		{
			if(node.equals(input))
			{
			return removeAndReturningHead(input);
			
			}
			else
			{
				return null;
			}
			
		}
		Node<Integer> head=input;
		Node<Integer> remove;
		if(node.equals(head))
		{
			return removeAndReturningHead(input);
		}
		while(!(node.equals(head.next)))
		{
			head=head.next;
		}
		remove=head.next;
		head.next=remove.next;
		remove.next=null;
		printLL(input);
		return remove;
		
		
	}
	public static Node<Integer> removeSpecificNode(Node<Integer> node, Node<Integer> input)
	{
		Node<Integer> head=input;
		if(input==null)
		{
			return null;
		}
		if(node.data.equals(head.data))
		{
			
			return input.next;
		}
		
		Node<Integer> previous=input;
		Node<Integer> current=previous.next;
		while(current!=null)
		{
			if(node.data.equals(current.data))
			{
				previous.next=current.next;
				return input;
			}
			else
			{
			previous=current;
			current=current.next;
			}
		}
		
		return input;
		
		
	
		
		
	}
	public static Node<Integer> removeAtPos(int pos, Node<Integer> input)
	{
		if(input==null)
		{
			return null;
		}
		if(pos<=0)
		{
			return input.next;
		}
		Node<Integer> previous=null;
		Node<Integer> current=input;
		while(current.next!=null && pos!=0)
		{
			previous=current;
			current=current.next;
			pos--;
		}
		previous.next=current.next;
		return input;
	}
	public static String toString(Node<Integer> input){
		
		String result="[";
		if(input==null){
			return result+"]";
			
		}
		Node<Integer> current=input;
		while(current!=null)
		{
			result=result + current.data+";";
			current=current.next;
		}
		
		return result+"]";
		
	}
	public static int length(Node<Integer> input)
	{
		Node<Integer> current=input;
		int count=0;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
	}
	public static int pos(Node<Integer> input, int data)
	{
		int count=0;
		Node<Integer> current= input;
		while(current!=null)
		{
			count++;
			if(current.data==data)
			{
				return count;
			}
			current=current.next;
		}
		return Integer.MIN_VALUE;
	}
	public static Node<Integer> swap(Node<Integer> input,int first, int second)
	{
		if(first==0)
		{
			if(second==1)
			{
				Node<Integer> p=input;
				Node<Integer> q= input.next;
				p.next=q.next;
				q.next=p;
				
				return q;
				
			}
			else
			{
				Node<Integer> p=input;
				Node<Integer> q=input;
				Node<Integer> r= null;
				Node<Integer> begin=input.next;
				while(second>0)
				{
					r=q;
					q=q.next;
					second--;
				}
				p.next=q.next;
				r.next=p;
				q.next=begin;
				return q;
			}
		}
		return input;
	}
	public static void main(String[] args) throws LinkedListEmptyException {
		// TODO Auto-generated method stub
		
	   Node<Integer> input = generatingLL();
	   Node<Integer> remove=new Node<Integer>();
	   remove.data=4;
	   remove.next=null;
	   printLL(swap(input,0,4));
	   //System.out.println(swap(input,0,1));
	}

}

