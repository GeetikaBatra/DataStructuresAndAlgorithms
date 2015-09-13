package Practice;

public class PairToSum {

	public static void pair(int[] array,int k,int index)
	{
		if(index==array.length-1)
		{
			return;
		}
		int firstNum=array[index];
		for(int i=index+1;i<array.length;i++)
		{
			if(array[i]==k-firstNum)
			{
				System.out.println(firstNum+","+array[i]);
				break;
			}
			
		}
		pair(array,k,index+1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={0,1,2,3,3,4,5,6};
		
		pair(array,6,0);

	}

}
