package ArraysAndStrings;


public class CStyleReverse {

	public static String reverse(String str)
	{
		if(str.length()==1)
		{
			return str;
		}
		 char character=str.charAt(0);
		String StrTemp=reverse(str.substring(1));
		return StrTemp+ character;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(reverse("abcd "));
	}

}
