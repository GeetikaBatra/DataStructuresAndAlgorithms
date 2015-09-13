package Practice;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pal("sis"));
	}
	public static boolean pal(String s)
	{
		
		if(s.length()==0 || s.length()==1)
		{
			return true;
		}
		boolean res=pal(s.substring(1, s.length()-1));
		if(s.charAt(0)==s.charAt(s.length()-1))
		{   
			if(res==true)
			{
				return true;
			}
	
			
		}
		return false;
	}

}
