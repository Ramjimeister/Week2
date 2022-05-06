package Week2Day2;

public class FindIntersectionNumber 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		int al=a.length;	
		for(int i=0; i<al; i++)
		{
			if(a[i]==b[i])
			{	
				System.out.print(a[i] + ", ");					
			}
		}	
	}
}