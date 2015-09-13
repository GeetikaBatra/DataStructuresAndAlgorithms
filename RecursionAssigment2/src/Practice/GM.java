package Practice;

public class GM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gm(2,0));
	}
	public static float gm(int a, int k)
	{
		if(k==0)
		{
			return 0;
		}
		if(k==1)
		{
			return 1;
		}
		float num=1;
		for(int i=k;i>1;i--)
		{
			num=num/a;
		}
		float sum=gm(a,k-1);
		return sum+num;
		
	}

}
