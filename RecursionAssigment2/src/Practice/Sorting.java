package Practice;

public class Sorting {

	public static int[] selectionSort(int[] array,int beginIndex)
	{
		if(beginIndex==array.length-1)
		{
			int[] output=new int[1];
			output[0]=array[beginIndex];
			return output;
		}
		int min=array[beginIndex];
		int minIndex=beginIndex;
		for(int i= beginIndex+1;i<array.length;i++)
		{
			if(min>array[i])
			{
				min=array[i];
				minIndex=i;
			}
			
		}
		int temp=array[beginIndex];
		array[beginIndex]=array[minIndex];
		array[minIndex]=temp;
		selectionSort(array,beginIndex+1);
		return array;
	}
	public static int[] insertionSort(int[] array,int beginIndex)
	{
		if(array.length==1)
		{
			return array;
			
		}
		int[] sortedSoFar=insertionSort(array,beginIndex+1);
		int fixIndex=0;
		for(int i=beginIndex+1;i<array.length;i++)
		{
			fixIndex=i;
			if(array[beginIndex]>sortedSoFar[i])
			{
				break;
			}
			
				
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={8,7,6,5,4,3,2,1};
		selectionSort(array,0);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}

}
