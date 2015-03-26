package Recursion;

import java.util.Scanner;

public class Krotation {

	public static void Krotation1(int[] input,int begin,int end) {
		int mid =(begin+end)/2;
		
		if(input[mid]>input[mid+1])
		{
			 System.out.println(mid);
		}
		
		else if(input[mid]<input[begin])
		{
			end=mid;
			Krotation1(input,begin,end);
		}
		else
		{
			begin=mid+1;
			Krotation1(input,begin,end);
			
		}
		
				
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] a1 = new int[6];
		
		for(int i=0;i<6;i++)
		{
			a1[i]=s.nextInt();
		}
		 
		Krotation1(a1,0,a1.length-1);
	}

}
