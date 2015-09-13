package Practice;

public class NumOfZeroes {
	
	public static int zero(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n%10!=0)
		{
			return 0;
		}
		int res=zero(n%10);
		return res+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(zero(10));
	}

}
