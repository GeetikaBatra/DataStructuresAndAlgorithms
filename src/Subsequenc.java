
public class Subsequenc {
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
	  for(int i=0;i<output.length;i++)
	  {
		  System.out.println(output[i]);
	  }
	}

}
