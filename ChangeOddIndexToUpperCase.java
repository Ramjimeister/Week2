package Week2Day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) 
	{
		String test = "changeme";
		char[] testArray = test.toCharArray();
		int len=testArray.length;
		  for(int i=0; i<len; i++) 
		  {
			  if(i%2==1)
			  {
				  testArray[i]=Character.toUpperCase(testArray[i]);
			  }
		  }
		  for(int i=0; i<len; i++) 
		  {
			  System.out.print(" " +testArray[i]);
		  }
	}
}