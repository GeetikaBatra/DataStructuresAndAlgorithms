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
	public static int midPoint(node<Integer> input)
	
	{
		int count=0;
		node<Integer> fast=input;
		while(fast!=null&&fast.next!=null)
		{
			fast=fast.next.next;
			count++;
		}

		return count;
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
	public static node<Integer> mergeSort(node<Integer> head)
	{
		if(head==null || head.next==null)
			return head;
			
		
		int mid=midPoint(head);
		node<Integer> firstPart=head;
		node<Integer> currentPosition = head;
		while(mid!=1)
		{
			currentPosition=currentPosition.next;
			mid--;
			 
		}
		node<Integer> secondPart=currentPosition.next;
		currentPosition.next=null;
		//printLinkedList(firstPart);
		//printLinkedList(secondPart);
		//return head;
		node<Integer> firstSorted=mergeSort(firstPart);
		node<Integer> secondSorted=mergeSort(secondPart);
		return merging(firstSorted,secondSorted);
		
		}

	public static node<Integer> merging(node<Integer> firstPart,node<Integer> secondPart)
	{
		node<Integer> output=new node<Integer>();
		node<Integer> currentPosition=output;
		
		if(firstPart.next==null && secondPart.next==null)
		{
			if(firstPart.data<secondPart.data)
				{
					firstPart.next=secondPart;
					return firstPart;
				}
			else
			{
				secondPart.next=firstPart;
				return secondPart;
			}
			
		}
		if(firstPart.data<secondPart.data)
			output=firstPart;
		else
			output=secondPart;
		while(firstPart!=null && secondPart!=null)
		{
			if(firstPart.data<secondPart.data)
			{
				
				currentPosition.next=firstPart;
				firstPart=firstPart.next;
				currentPosition=currentPosition.next;
			}
			else
			{
				currentPosition.next=secondPart;
				secondPart=secondPart.next;
				currentPosition=currentPosition.next;
			}
			
			
		}
		if(firstPart!=null)
			currentPosition.next=firstPart;
		else
			currentPosition.next=secondPart;
		
	
		return output;

		
	
		
	}
	public static node<Integer> bubbleSort(node<Integer> head)
	{
		if(head==null || head.next==null)
			return head;
		
		node<Integer> sortedSoFar=null;
		node<Integer> remaining = head;
	 
		while(remaining!=null)
		{
			node<Integer> currentNode = remaining;
			int i=0;
			while(currentNode.next.next!=null)
			{
				if(currentNode.data>currentNode.next.data)
				{
					remaining=swap(remaining,i,i+1);
				}
				currentNode=currentNode.next;
				i++;
			}
			currentNode.next.next=sortedSoFar;
			sortedSoFar=currentNode.next;
			currentNode.next=null;
			
			
			
			
			
		}
		return sortedSoFar;
	}	
	 
	public static node<Integer> recursiveBubble(node<Integer> head)
	{
		if(head==null || head.next==null)
			return head;
		
		node<Integer> sortedSoFar=recursiveBubble(head.next);
		head.next=sortedSoFar;
		node<Integer> currentPosition=head;
		while(currentPosition != null && currentPosition.next!=null)
		{
			int i=0;
			if(currentPosition.data>currentPosition.next.data)
			{
				head=swap(head,i,i+1);
			}
			
			currentPosition=currentPosition.next;
			i++;
				
		}
		return head;
		
					
	
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
	
		
	public static node<Integer> swap(node<Integer> head, int i, int j) {
		if (i == 0) {
			node<Integer> ith = head;
			node<Integer> prevj = null;
			node<Integer> jth = head;
			int count = 0;
			while (count < j) {
				prevj = jth;
				jth = jth.next;
				count++;
			}
			head = jth;
			node<Integer> nexti = ith.next;
			node<Integer> nextj = jth.next;

			if (i == j - 1) {
				jth.next = ith;
				ith.next = nextj;
			} else {
				ith.next = nextj;
				prevj.next = ith;
				jth.next = nexti;
			}
			return head;

		}

		node<Integer> previ = null;
		node<Integer> ith = head;
		int count = 0;
		while (count < i) {
			previ = ith;
			ith = ith.next;
			count++;
		}

		node<Integer> prevj = null;
		node<Integer> jth = head;
		count = 0;
		while (count < j) {
			prevj = jth;
			jth = jth.next;
			count++;
		}
		node<Integer> nexti = ith.next;
		node<Integer> nextj = jth.next;

		if (i != j - 1) {

			previ.next = jth;
			prevj.next = ith;

			ith.next = nextj;
			jth.next = nexti;
		} else {
			previ.next = jth;
			ith.next = nextj;
			jth.next = ith;
		}

		return head;
	}
 
	
		
				
	public static node<Integer> arranging(node<Integer> Head)
	{
		if(Head==null || Head.next==null)
		{
			return Head;
		}
		node<Integer> output=arranging(Head.next);
		node<Integer> current = output;
		if(Head.data%2==0)
		{
			while(current.next.data%2!=0);			{
				current=current.next;
			}
			Head.next=current.next;
			current.next=Head;
			
		}
		else
		{
			Head.next=output;
			output=Head;
		}
		return output;
		
		
		
		
	}
	
	public static void printReverse(node<Integer> head)
	{
		
		//if(head.next==null || head==null)
		if(head==null)
		{
			//System.out.println(head.data);
			return;
			
		}
		else
			{
				printReverse(head.next);
				System.out.println(head.data);
			}
		
		
	}
	
	public static node<Integer> append(node<Integer> Head,int n)
	{
		node<Integer> firstPart = Head;
		node<Integer> secondPart;
		node<Integer> current=Head;
		while(n!=0)
		{
			current=current.next;
			n--;
		}
		secondPart=current.next;
		current.next=null;
		current=secondPart;
		while(current.next!=null)
		{
			current=current.next;
			
		}
		current.next=firstPart;
		return secondPart;
		
	}
	public static node<Integer> reverseRecursive(node<Integer> Head)
	{
		if(Head==null || Head.next==null)
		{
			return Head;
		}
		
		node<Integer> output=reverseRecursive(Head.next);
		node<Integer> current = output;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=Head;
		Head.next=null;
		return output;
		
	}
	public static void main(String[] args)
	{
		
		node<Integer> Head = takeInputOfLinkedList();
		
		
		//System.out.println(midPoint(Head));
	
		//printReverse(Head);
		
		
		
	}
}
