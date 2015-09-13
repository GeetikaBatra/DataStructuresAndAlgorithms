package DataStructures;
 class MapPair {
	String Key;
	String Value;
	MapPair next;

}
 class MapPairNode {
	
		MapPair data;
		public MapPairNode()
		{
			data=new MapPair();
		}
	}
public class Map {
   static int size=0;
   static MapPairNode[] bucket=new MapPairNode[5];
	public static int size()
	{
		return size;
	}
	public static boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		return false;
	}
	public static int compress(int hash)
	{
		return hash%bucket.length;
	}
	
	public static void put(String value,String key)
	{
		int hash=key.hashCode();
		int index=compress(hash);
		MapPair element = new MapPair();
		element.Key=key;
		element.Value=value;
		if(bucket[index].data==null)
			element=bucket[index].data;
		else
		{
		element.next=bucket[index].data;
		bucket[index].data=element;
		}
	
		
	}
	public static void main(String[] args)
	{
		put("abc","def");
		
	}
	
	}
