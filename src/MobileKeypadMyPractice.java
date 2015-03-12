
public class MobileKeypadMyPractice {
	public static String getKeypad(char c) {
		if (c == '2') {
			return "abc";
		} else if (c == '3') {
			return "def";
		}  else if (c == '4') {
			return "ghi";
		} else if (c == '5') {
			return "jkl";
		} else if (c == '6') {
			return "mno";
		} else if (c == '7') {
			return "pqrs";
		}  else if (c == '8') {
			return "tuv";
		} else {
			return "wxyz";
		}
		
	}
	public static String[] keypadCombinations(String input)
	{
		if(input.length()==0)
		{
			String[] output=new String[1];
			output[0] = "";
			return output;
					
		}
		String correspondingToChar = getKeypad(input.charAt(0));
		String[] smallerOutput = keypadCombinations(input.substring(1));
		String[] output = new String[correspondingToChar.length()*smallerOutput.length];
		int k=0;
		for(int i=0;i<correspondingToChar.length();i++)
		{
			for(int j=0;j<smallerOutput.length;j++)
			{
				output[k]= correspondingToChar.charAt(i)+smallerOutput[j];
				k++;
			}
		}
		return output;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] output = keypadCombinations("234");
		for(int i=0;i<output.length;i++)
		{
			System.out.println(output[i]);
		}

	}

}
