package Practice;

public class StringToNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int correspondingChar(char c)
	{
		if(c=='0')
		{
			return 0;
		}
		else if(c=='1')
		{
			return 1;
		}
		else if(c=='2')
		{
			return 2;
		}
		else if(c=='3')
		{
			return 3;
		}
		else if(c=='4')
		{
			return 4;
		}
		else if(c=='5')
		{
			return 5;
		}
		else if(c=='6')
		{
			return 6;
		}
		else if(c=='7')
		{
			return 7;
		}
		else if(c=='8')
		{
			return 8;
		}
		else if(c=='9')
		{
			return 9;
		}
		else
		{
			return -1;
		}
	}
	public static int ret(String s)
	{
	   if(s.length()==1)
	   {
		   return correspondingChar(s.charAt(0));
	   }
	  
	   int digit=correspondingChar(s.charAt(0));
	   int res=ret(s.substring(1));
	   
	   
	}

}
