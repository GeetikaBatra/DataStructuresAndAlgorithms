package CircularLinkedList;

import java.util.Scanner;

public class CircularList {
	
	private static CLLNode Head=null;
	private static CLLNode Tail=null;
	
	public static int CircularListLength()
	{
		if(Head==null)
		{
			return 0;
		}
		int length=0;
		CLLNode current=Head;
		while(current!=Tail)
		{
			length++;
			current=current.next;
		}
		return length+1;
	}
	
	public static void generateCLL()
	{
//		CLLNode Head = null;
//		CLLNode Tail=null;
		System.out.println("Enter the elements");
		CLLNode temp=new CLLNode();
		Scanner s = new Scanner(System.in);
		int data=s.nextInt();
		if(Head==null && data!=-1)
		{
			temp.data=data;
			temp.next=temp;
			Head=temp;
	        Tail=temp;
			
		}
		data=s.nextInt();
		while(data!=-1)
		{   
			temp=new CLLNode();
			temp.data=data;
			temp.next=Head;
			Tail.next=temp;
			Tail=Tail.next;
			
			data=s.nextInt();
		}
	}
	public static void printCLL(CLLNode Head)
	{
		CLLNode current = Head;
		while(current.next!=Head)
		{
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println(current.data);
		current=current.next;
		while(current.next!=Head)
		{
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println(current.data);
	}
	public static void Inserting(int pos,int data)
	{
		CLLNode temp= new CLLNode();
		temp.data=data;
		if(pos<=0)
		{
			
			temp.next=Head;
			Tail.next=temp;
			Head=temp;
			return;
		}
		if(pos>=CircularListLength()-1){
			
		temp.next=Head;
		Tail.next=temp;
		Tail=Tail.next;
		return;
		}
		CLLNode current=Head;
		while(pos!=1)
		{
			current=current.next;
			pos--;
		}
		temp.next=current.next;
		current.next=temp;
		
		
	}
	public static CLLNode deleting(int pos)
	{
		CLLNode temp;
		if(pos==0)
		{
			
			temp=Head;
			Tail.next=Head.next;
			Head=Head.next;
			temp.next=temp;
			return temp;
					
		}
		CLLNode current=Head;
		if(pos>=CircularListLength()-1)
		{	
			while(current.next!=Tail)
			{
				current=current.next;
			}
			temp=Tail;
			current.next=Head;
			Tail=current;
			temp.next=temp;
			return temp;
		}
		while(pos>1)
		{
			current=current.next;
			pos--;
		}
		temp=current.next;
		current.next=current.next.next;
		temp.next=temp;
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			generateCLL();
			//Inserting(3,5);
			
			System.out.println(deleting(3).data);
			printCLL(Head);
			//System.out.println(CircularListLength());
			
	}

}
