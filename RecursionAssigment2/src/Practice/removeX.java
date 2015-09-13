package Practice;

public class removeX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rep("abc"));
	}
	public static String rep(String s)
	{
		if(s.length()==1)
		{
			if(s.equals("x"))
			{
				return "";
			}
				
			return s;
		}
		String res=rep(s.substring(1));
		if(s.charAt(0)=='x')
		{
			return res;
		}
		else 
		{
			return s.charAt(0)+res;
		}
		
	}
}
