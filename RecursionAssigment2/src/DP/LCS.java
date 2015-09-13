package DP;

public class LCS {

	public static int Ed(String s1,String s2)
	{
		if(s1.length()==0 || s2.length()==0)
		{
			return 0;
		}
			int dpArray[][]=new int[s1.length()+1][s2.length()+1];
			for(int i=0;i<=s1.length();i++)
			{
				dpArray[i][0]=i;
			}
			for(int j=0;j<=s2.length();j++)
			{
				dpArray[0][j]=j;
			}
			for(int i=1;i<=s1.length();i++)
			{
				for(int j=1;j<=s2.length();j++)
				{
					if(s1.charAt(s1.length()-i)== s2.charAt(s2.length()-j))
					{
						dpArray[i][j]=dpArray[i-1][j-1];
					}
					else
					{
						int min=Math.min(1+dpArray[i-1][j-1],1+ dpArray[i][j-1]);
						
								
						dpArray[i][j]=Math.min(min,1+dpArray[i-1][j]);
					}
				}
					
			}
			return dpArray[s1.length()][s2.length()];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abcd";
		String s2="cbad";
		int EditDistance=Ed(s1,s2);
		System.out.println(EditDistance);
	}

}
