package Recursion;

public class combinations1123 {
	public static String correspondingChar(String c)
	{
		if(c.equals("1"))
		{
			return "a"; 
					
		}
		else if(c.equals("2"))
		{
			return "b";
		}
		else if(c.equals("3"))
		{
			return "c";
		}
		else if(c.equals("4"))
		{
			return "d";
		}
		else if(c.equals("5"))
		{
			return "e";
		}
		else if(c.equals("6"))
		{
			return "f";
		}
		else if(c.equals("7"))
		{
			return "g";
		}
		else if(c.equals("8"))
		{
			return "h";
		}
		else if(c.equals("9"))
		{
			return "i";
		}
		else if(c.equals("10"))
		{
			return "j";
		}
		else if(c.equals("11"))
		{
			return "k";
		}
		else if(c.equals("12"))
		{
			return "l";
		}
		else if(c.equals("13"))
		{
			return "m";
		}
		else if(c.equals("14"))
		{
			return "n";
		}
		else if(c.equals("15"))
		{
			return "o";
		}
		else if(c.equals("16"))
		{
			return "p";
		}
		else if(c.equals("17"))
		{
			return "q";
		}
		else if(c.equals("18"))
		{
			return "r";
		}
		else if(c.equals("19"))
		{
			return "s";
					
		}
		else if(c.equals("20"))
		{
			return "t";
		}
		else if(c.equals("21"))
		{
			return "u";
		}
		else if(c.equals("22"))
		{
			return "v";
		}
		else if(c.equals("23"))
		{
			return "w";
		}
		else if(c.equals("24"))
		{
			return "x";
		}
		else if(c.equals("25"))
		{
			return "y";
		}
		else
		{
			return "z";
		}
		
	}
	
	public static String[] Combinations(String input)
	{
		if(input.length()==2)
		{
			if(Integer.parseInt(input)<26){
				String[] output = new String[2];
				
				output[0]=correspondingChar(input.substring(0,1))+correspondingChar(input.substring(1));
				output[1]= correspondingChar(input);
				return output;
				
			}
			else{
				
				String[] output = new String[1];
				output[0]=output[0]=correspondingChar(input.substring(0,1))+correspondingChar(input.substring(1));
				
				return output;
			}
			
			
			
		}
		
	
		String[] SmallerArray = Combinations(input.substring(2));
		
		 	 
	
		   String temp = input.substring(0,2);
			if(Integer.parseInt(input.substring(0,2))<26){
				String[] output = new String[SmallerArray.length+1];
				
				output[0]=correspondingChar(temp.substring(0,1))+correspondingChar(temp.substring(1))+ SmallerArray;
				output[1]= correspondingChar(input);
				return output;
				
			}
			else{
				
				String[] output = new String[1];
				output[0]=output[0]=correspondingChar(input.substring(0,1))+correspondingChar(input.substring(1));
				
				return output;
			}
			
		else
			
		{	String[] output = new String[firstSmallerArray.length];
			for(int k=0;k<firstSmallerArray.length;k++)
			{
				
				output[k] = correspondingChar(input.substring(0,1))+ firstSmallerArray[k];
				
			
			}
			return output;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] output = Combinations("1123");
		for(int i=0;i<output.length;i++)
		{
			System.out.println(output[i]);
		}
		
		
		
		
	}

}
