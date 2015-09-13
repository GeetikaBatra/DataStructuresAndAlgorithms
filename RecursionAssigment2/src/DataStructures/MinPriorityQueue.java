package DataStructures;

import java.util.ArrayList;

public class MinPriorityQueue<V> {
	
	private ArrayList<HeapPair<V>> heapArray;
	public MinPriorityQueue()
	{
		 heapArray=new ArrayList<HeapPair<V>>();
		 heapArray.add(null);
	}
	public int size(){
		return heapArray.size()-1;
		
	}
	public boolean isEmpty()
	{
		if(size()==0)
			return true;
		
		return false;
	}
	public V min() throws HeapEmptyException
	{
		if(isEmpty())
		{
			HeapEmptyException e = new HeapEmptyException();
			throw e;
		}
		return heapArray.get(1).value;
	}
	public void insert(int priority,V value)
	{
		HeapPair<V> p= new HeapPair<V>();
		p.priority=priority;
		p.value=value;
		heapArray.add(p);
		
		int childIndex= heapArray.size()-1;
		int parentIndex=childIndex/2;
		while(childIndex>1)
		{
		if(heapArray.get(parentIndex).priority<heapArray.get(childIndex).priority)
		{
			HeapPair<V> temp=heapArray.get(parentIndex);
			
			heapArray.set(parentIndex, heapArray.get(childIndex));
			heapArray.set(childIndex,temp);
			
			
		}
		else
		{
			break;
		}
		  childIndex=parentIndex;
		  parentIndex=parentIndex/2;
		}
	}
	public V removeMin() throws HeapEmptyException
	{
		if(isEmpty())
		{
			HeapEmptyException e = new HeapEmptyException();
			throw e;
		}
		int lastIndex=heapArray.size()-1;
		HeapPair<V> temp=heapArray.get(1);
		
		
		heapArray.set(1, heapArray.get(lastIndex));
		heapArray.set(lastIndex,temp);
		int currentIndex=1;
		int firstChildIndex=2*currentIndex;
		int secondChildIndex;
		int toBeSwappedWith=-1;
		while(firstChildIndex<heapArray.size())
		{
			secondChildIndex=currentIndex*2+1;
			
			if(heapArray.get(firstChildIndex).priority<heapArray.get(currentIndex).priority)
			{
				
				 toBeSwappedWith=firstChildIndex;
				
			}
			if(secondChildIndex<heapArray.size())
			{
				if(heapArray.get(secondChildIndex).priority<heapArray.get(firstChildIndex).priority)
				{
					toBeSwappedWith=secondChildIndex;
				}
			}
			if(toBeSwappedWith!=-1)
			{
				 temp=heapArray.get(currentIndex);
				
				
				heapArray.set(currentIndex, heapArray.get(toBeSwappedWith));
				heapArray.set(toBeSwappedWith,temp);
			}
			else
			{
				break;
			}
			currentIndex
		}
		
		
	}
	public static void put(String value,String key)
	{
		int arr={
	}
}
