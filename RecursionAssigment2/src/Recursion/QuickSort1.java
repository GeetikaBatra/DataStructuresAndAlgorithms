package Recursion;

import java.util.Scanner;

public class QuickSort1 {
	public static void splitting(int[] input,int beginIndex,int endIndex)
	{
		int pivotPosition = pivot(input,beginIndex,endIndex);
		splitting(input,0,pivotPosition-1);
		splitting(input,pivotPosition+1,endIndex);
		
		
	}
	public static int pivot(int[] input,int beginIndex,int endIndex)
	{
		int pivotElement = input[0];
		beginIndex++;
		int temp;
		while(beginIndex<endIndex)
		{	
			while(input[beginIndex]<pivotElement)
			{
				beginIndex++;
			}
			while(input[endIndex]>pivotElement)
			{
				endIndex--;
			}
			if(beginIndex<endIndex)
			{
			temp=input[beginIndex];
			input[beginIndex]=input[endIndex];
			input[endIndex]=temp;
			beginIndex++;
			endIndex--;
			}
			
		}
		temp=input[beginIndex];
		input[beginIndex]=input[0];
		input[0]=temp;
		
		return beginIndex;
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = new int[7];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<input.length;i++)
		{
			input[i]=s.nextInt();
		}
		splitting(input,0,input.length-1);
		
		for(int i=0;i<input.length;i++)
		{
			System.out.println(input[i]);
		}
		
	}

}
