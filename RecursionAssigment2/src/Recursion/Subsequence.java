package Recursion;

public class Subsequence {
	public static String[] printSubsequence(String input)
	{
		if(input.length()==0)
		{
			String[] output = new String[1];
			output[0]= "";
			return output;
		}
		String[] smallerOutput = printSubsequence(input.substring(1));
		
	    String[] output = new String[smallerOutput.length*2];
	    int k=0;
	    for(int i=0;i<output.length;i++)
	    {	
	    	
	    	if(i<smallerOutput.length)
	    	{
	    		output[k]=smallerOutput[i];
	    		
	    	}
	    	
	    	else
	    		
	    	{
	    		output[k]=input.charAt(0)+smallerOutput[i-smallerOutput.length];
	    	}
	    	k++;
	    }
		return output;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String[] output = printSubsequence("abc");
	  int count=0;
	  for(int i=0;i<output.length;i++)
	  {  int endIndex=output[i].length()-1;
	  	 int beginIndex =0;
	  	 
		  while(beginIndex<=endIndex)
		  {
			  if(endIndex>beginIndex)
			  {
				  break;
			  }
			  if(output[i].charAt(beginIndex)==output[i].charAt(endIndex))
			  {
				  beginIndex++;
				  endIndex--;
			  }
			  
				  
			 count++;
		  }
			  
		 
	  }
	  System.out.println(count);
	}

}
