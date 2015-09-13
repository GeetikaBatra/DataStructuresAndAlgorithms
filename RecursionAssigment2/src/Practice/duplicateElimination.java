package Practice;

import java.util.Scanner;

public class duplicateElimination {

	public static String duplicate(String s)
	{
		if(s.length()==1)
			return s;
		String s1= duplicate(s.substring(1));
		
		if(s.charAt(0)!=s1.charAt(0))
		{
			s1=s.charAt(0)+s1;
		}
		return s1;
			
		    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1=s.next();
		System.out.println(duplicate(s1));
	}

}
