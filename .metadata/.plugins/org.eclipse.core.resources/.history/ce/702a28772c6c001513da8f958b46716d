package ArraysAndStrings;

public class MergeSort {

	
	public static void mergeSort(int[] input,int beginIndex, int endIndex)
	{
		if(beginIndex>=endIndex)
		{
			return;
		}
		int mid=(beginIndex+endIndex)/2;
		mergeSort(input,beginIndex,mid);
		mergeSort(input,mid+1,endIndex);
		
		int[] temp=merge(input,beginIndex,mid,endIndex);
		
		for(int i=0;i<temp.length;i++)
		{
			input[i+beginIndex]=temp[i];
		}
		
	}
	public static int[] merge(int[] input, int beginIndex,int mid,int endIndex)
	{
		int i= beginIndex;
		int j=mid+1;
		int[] temp = new int[endIndex-beginIndex+1];
		int k=0;
		while(i<=mid && j<=endIndex)
		{
			if(input[i]<=input[j])
			{
				temp[k]=input[i];
				i++;
				k++;
			}
			else if(input[i]>input[j])
			{
				temp[k]=input[j];
				j++;
				k++;
			}

		}
		if(i>mid)
		{
			while(j<=endIndex)
			{
				temp[k]=input[j];
				j++;
				k++;
			}
		}
		else if(j>endIndex)
		{
			while(i<=mid)
			{
				temp[k]=input[i];
				i++;
				k++;
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x={5,4,3,2,1};
		
		mergeSort(x,0,4);
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
		
	}

}
