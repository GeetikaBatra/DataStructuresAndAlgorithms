package Mapping;

public class Map {

	PairNode[] bucket;
	int size;
	
	public Map()
	{
		bucket = new PairNode[5];
	}
	
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		if(size()==0)
			return true;
		
		return false;
	}
	public int getCompressedHashCode(String key)
	{
		int hashcode = key.hashCode();
		int compressed = hashcode%bucket.length;
		
		return compressed;
	}
	
	public String getValue(String key)
	{
		int h = getCompressedHashCode(key);
		PairNode temp = bucket[h];
		while(temp!=null)
		{
			if(temp.data.key.equals(key))
			{
				return temp.data.value;
			}
			temp=temp.next;
		}
		return null;
	}
	public String removeHash(String key)
	{
//		int h= getCompressedHashCode(key);
//		PairNode current= bucket[h];
//		if(current.data.key.equals(key))
//		{
//			bucket[h]=current.next;
//			return current.data.value;
//		}
//		PairNode previous=current;
//		current=current.next;
//		while(current!=null)
//		{
//			if(current.data.key.equals(key))
//			{
//				previous.next=current.next;
//				return current.data.value;
//				size --;
//			}
//			previous = current;
//			current=current.next;
//		}
//		return null;
		int h= getCompressedHashCode(key);
		PairNode current=bucket[h];
		PairNode previous = null;
		while(current!=null)
		{
			if(current.data.key.equals(key))
			{
				break;
			}
			previous=current;
			current=current.next;
			
		}
		if(current==null)
		{
			return null;
		}
		size --;
		if(previous==null)
		{
			
			bucket[h]=current.next;
			
		}
		else
		{
			previous.next=current.next;
			
		}
		return current.data.value;
		
	}
	public void add(String key, String value)
	{
		int h = getCompressedHashCode(key);
		PairNode head=bucket[h];
		PairNode temp=head;
		
		while(temp!=null)
		{
			if(temp.data.key.equals(key))
			{
				temp.data.value=value;
				return;
			}
			temp=temp.next;
		}
		PairNode newNode=new PairNode();
		newNode.data.key=key;
		newNode.data.value=value;
		newNode.next=head;
		bucket[h]=newNode;
		size++;
		
		if((size*1.0)/(1.0*bucket.length)>0.6)
		{
			rehash();
		}
	}
	public void rehash()
	{
		
		PairNode[] tempBucket=bucket;
		bucket = new PairNode[bucket.length*2];
		PairNode currentBucketHead;
		size=0;// size is automatically incremented in add function, so we dont need the size function
		for(int i=0;i<tempBucket.length;i++)
		{
			currentBucketHead=tempBucket[i];
			while(currentBucketHead!=null)
			{
				add(currentBucketHead.data.key,currentBucketHead.data.value);
				currentBucketHead= currentBucketHead.next;
			}
		}
		
		
	
	}
	
	
}
