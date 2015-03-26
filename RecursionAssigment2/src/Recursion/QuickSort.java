package Recursion;

import java.util.Scanner;

public class QuickSort {

	public static void quickSort(int[] input,int beginIndex,int endIndex) {
		// TODO Auto-generated constructor stub
		if(beginIndex>=endIndex)
		{
			return;
		}
		int pivotPosition=partition(input,beginIndex,endIndex);
		quickSort(input,beginIndex,pivotPosition-1);
		quickSort(input,pivotPosition+1,endIndex);
		
		for(int i=0;i<input.length;i++)
		{
			System.out.println(input[i]);
		}
		
		
		
		
	}
	public static int partition(int[] input,int beginIndex,int endIndex)
	{
		int pivot = input[0];
		int count=0;
		for(int i=1;i<input.length;i++)
		{
		
			if(input[i]<pivot)
			{
				count++;
				
			}
			
			
		}
		int temp=0;
	    temp = input[count];
	    input[count]=input[beginIndex];
	    input[beginIndex]=temp;
	    while(beginIndex<count && endIndex>count)
	    {
	    
	    	if(input[beginIndex]>pivot)
	    	{
	    		break;
	    	}
	    	else
	    	{
	    		beginIndex++;
	    	}
	    	if(input[endIndex]<pivot)
	    	{
	    		break;
	    	}
	    	else
	    	{
	    		endIndex--;
	    	}
	    	
	    	temp=input[endIndex];
	    	input[endIndex]=input[beginIndex];
	    	input[beginIndex]=temp;
	    	beginIndex++;
	    	endIndex--;
	    	
	    	
	    	
	    }
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int[] input=new int[6];
		for(int i=0;i<input.length;i++)
		{
			input[i]=s.nextInt();
		}
		
		quickSort(input,0,input.length-1);
	}

}
