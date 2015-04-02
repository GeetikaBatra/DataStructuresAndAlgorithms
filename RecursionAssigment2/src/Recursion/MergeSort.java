package Recursion;

import java.util.Scanner;

public class MergeSort {
	public static int[] merging(int[] firstPart,int[]secondPart)
	
	{
		
		int[] output= new int[firstPart.length+secondPart.length];
		int k=0;
		int i=0;
		int j=0;
		while(i<firstPart.length && j<secondPart.length)
		{
			if(firstPart[i]<secondPart[j])
			{
				output[k]=firstPart[i];
				i++;
			}
			else
			{
				output[k]=secondPart[j];
				j++;
			}
			k++;
		}
		if(i<firstPart.length)
		{
			while(k<output.length)
			{
				output[k]=firstPart[i];
				i++;
				k++;
			}
		}
		else
		{
			while(k<output.length)
			{
				output[k]=secondPart[j];
				j++;
				k++;
			}
		}
		return output;
	}
	public static int[] splitting(int[] input,int beginIndex,int endIndex)
	{
		
		if(endIndex==beginIndex)
		{
			int[] output =new int[1];
			output[0]=input[beginIndex];
			return output;
		}
		
		if(endIndex-beginIndex==1)
		{	
			int[] output =new int[2];
			
			if(input[beginIndex]>input[endIndex])
			{
				output[0]=input[endIndex];
				output[1]=input[beginIndex];
				
				
				return output;
			}
		}
		int mid=(beginIndex+endIndex)/2;
		int[] firstPart = splitting(input,beginIndex,mid);
		int[] secondPart = splitting(input,mid+1,endIndex);
		return merging(firstPart,secondPart);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[7];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<input.length;i++)
		{
			input[i]=s.nextInt();
		}
		int[] output= splitting(input,0,input.length-1);
		
		for(int i=0;i<input.length;i++)
		{
			System.out.println(output[i]);
		}
	}

}
