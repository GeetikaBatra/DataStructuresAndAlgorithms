
public class MadhuSubstring {
	
		public static void subset(String s, String sofar)
		{
			//I have done it without using sofar and making the subset function a string array type,so that it returns array
			if(s.length()==0)// when length is 0 you should return an array containing one element which is empty
				//
				System.out.println(sofar);
			
		for(int i=0;i<s.length();i++)
			{
				subset(s.substring(0,i),s.charAt(i)+sofar);
				//subset(s.substring(1,i+1),s.charAt(i+1) + sofar);
				

			}
			return;

		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			subset("abc"," ");
		}
	
}
