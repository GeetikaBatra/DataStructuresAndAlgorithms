package Practice;

public class IntersectionOf2Arrays {
public static void intersection(int[] array1, int[] array2)
{
	for(int i=0;i<array1.length;i++)
	{
		for(int j=0;j<array2.length;j++)
		{
			if(array1[i]==array2[j])
			{
				System.out.println(array1[i]);
				break;
				
			}
			
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] array1={1,2,3,4,5};
         int[] array2={2,3,4,5};
         intersection(array1,array2);
	}

}
