package Practice;

public class MulDiv {

	
	public static int mul(int first, int second)
	{
		
		if(second==0)
		{
			return 0;
		}
		
		int res=mul(first, second-1);
		return res + first;
	}
	public static int div(int first, int second)
	{
		if(second ==0)
		{
			return 0;
		}
		if(first<second)
		{
			return 0;
		}
		int res=div(first-second, second);
				
		return res+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(mul(0,4));
      System.out.println(div(0,4));
      
	}

}
