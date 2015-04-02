package DataStructures;

import java.util.Scanner;

public class linkedList {
	public static node<Integer> takeInputOfLinkedList()
	{
		node<Integer> Head = null;
		node<Integer> PrevNode = null;
		System.out.println("Enter the next element");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		while(input!=-1)
		{
			
			node<Integer> newNode = new node<Integer>();
			newNode.data=input;
			newNode.next=null;
			
			if(Head==null)
			{
				Head=newNode;
				PrevNode=Head;
				
			}
			else
			{
				PrevNode.next=newNode;
				PrevNode=PrevNode.next;
				
				
			}
			
			input=s.nextInt();
		}
		
		return Head;
		
		
		
	}
	
	public static node<Integer> getLinkedList()
	{
		node<Integer> head = null;
		node<Integer> previous = null;
		int count=0;
		int currentPosition;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the new Element");
		int input = s.nextInt();
		
		
		while(s.nextInt()!=-1)
		{
			node<Integer> newNode = new node<Integer>();
			newNode.data=input;
			newNode.next=null;
			if(head==null)
			{
				head=newNode;
				
			}
			else
			{
				
				previous.next=newNode;
				
				
			}
			previous=newNode;
			System.out.print("Enter the next Element");
			input = s.nextInt();
		}
		return head;
		
	}
	

	public static void printLinkedList(node<Integer> input)
	{
		node<Integer> current = input;
		while(current !=null)
			
		{
			System.out.println(current.data + " ");
			current=current.next;
			
		}
		System.out.println();
	}
	public static node<Integer> deleteNode(int n,node<Integer> input)
	{
		if(n==0)
		{
			input=input.next;
			return input;
		}
		n--;
		node<Integer> currentPosition=input;
		while(n!=1)
		{
			currentPosition=currentPosition.next;
			n--;
			
		}
		currentPosition.next=currentPosition.next.next;
		return input;
		
	}
	public static node<Integer> InsertNode(int n,node<Integer> input)
	{
		System.out.println("Enter the data to be inserted");
		node<Integer> newNode=new node<Integer>();
		Scanner s = new Scanner(System.in);
		
		newNode.data=s.nextInt();
		
		node<Integer> currentPosition=input;
		
		
		if(n==0)
		{
			newNode.next=input;
			return newNode;
		}
		while(n!=1)
		{
			currentPosition=currentPosition.next;
			n--;
		}
		newNode.next=currentPosition.next;
		currentPosition.next=newNode;
		return input;
	}
	public static int findMinPosition(node<Integer> head)
	{
		int minPosition = 0;
		node<Integer> minNode=head;
		node<Integer> temp = head;
		int currentPosition=0;
		while(temp!=null)
		{
			if(temp.data<minNode.data)
			{
				minPosition=currentPosition;
				minNode=temp;
			}
			currentPosition++;
			temp =temp.next;
		}
		return minPosition;
	}
	
	public static node<Integer> selectionSort(node<Integer> head)
	{
		if(head==null || head.next==null)
			return head;
		
		node<Integer> sortedSoFar = head;
		
		node<Integer> remaining= head.next;
		head.next=null;
		while(remaining != null)
		{
			node<Integer> currentNode = remaining;
			remaining = remaining.next;
			
			node<Integer> temp = sortedSoFar;
			node<Integer> prevTemp = null;
			while(temp!=null)
			{
				if(temp.data>currentNode.data){
					if(prevTemp == null)
					{
						currentNode.next = sortedSoFar;
						sortedSoFar=currentNode;
					}
					else
					{
						currentNode.next=temp;
						prevTemp.next=currentNode;
					}
					break;
				}
				prevTemp=temp;
				temp=temp.next;
		
				
				
			}
			if(temp==null)
			{
				prevTemp.next=currentNode;
				currentNode.next=null;
			}
		}
		return sortedSoFar;
	}
	
		
	public static void swap(int ith,int jth,node<Integer> input)
	{
		int n=1;
		node<Integer> LinkedList1=input;
		node<Integer> currentPosition=LinkedList1;
		while(n<ith)
		{
			currentPosition=currentPosition.next;
			n++;
		}
		node<Integer> LinkedList2=currentPosition.next;
		currentPosition.next=null;
		
	    currentPosition=LinkedList2;
	   
		
		while(n<jth-ith)
		{
			currentPosition=currentPosition.next;
		}
		node<Integer> LinkedList3=currentPosition.next;
		currentPosition.next=null;
	   printLinkedList(LinkedList1);
	   printLinkedList(LinkedList2);
	   printLinkedList(LinkedList3);
	   
	}
	public static void main(String[] args)
	{
		
		node<Integer> Head = takeInputOfLinkedList();
		
		
		swap(2,3,Head);
		
	}
}
