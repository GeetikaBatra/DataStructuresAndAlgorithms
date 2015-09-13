package Practice;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static String binary(int num)
	{
		if(num==1)
			return "1" ;
		
		int digit=num%2;
		String s=binary(num/2);
		s=s+digit;
		return s;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s = new Scanner(System.in);
         int num = s.nextInt();
         System.out.println(binary(num));
	}

}
