package DataStructures;

class MapUse {
	   static int size=0;
	   static MapPair[] bucket=new MapPair[5];
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
			MapPair element=new MapPair();
			element.Key=key;
			element.Value=value;
			if(bucket[index].key==null)
			{
				bucket[index].Data.Key=key;
				bucket[index].Data.Value=value;
				bucket[index].Data.next=null;
				
				
				
			    
			  
			}
			else
			{
			
			
			
				element.next=bucket[index].Data;
				bucket[index].Data=element;
			
			
			
			}
	 
	 
		}
		public static void main(String[] args)
		{
			put("abc","def");
	 
		}
	 
		}
	 