package Practice;

public class ReplacingByPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rep("x"));
	}
	
	public static String rep(String s)
	{
		if(s.length()==1)
		{
			return s;
		}
		if(s.length()==2){
			if(s.equals("pi"))
			{
				return "3.14";
			}
			else return s;
		}
		String res = rep(s.substring(1));
		if(s.substring(0, 2).equals("pi"))
		{
			return "3.14" + res.substring(1);
		}
		return s.charAt(0)+ res;
	}

}
