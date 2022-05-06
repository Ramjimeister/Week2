package Week2Day2;

public class palindrome 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String[] P={"m","a","l","a","y","a","l","a","m"};
		int flage=0;
		int L=P.length;
		
		for(int i=0; i<L; i++)
		{
			System.out.print(P[i]);
		}
		System.out.println("  ");
		System.out.println("Lenght of the String is " + L);
		int j=L-1;
		for(int a=0; a<L; a++)
		{
				if(P[a]==P[j])
				{
					j--;
					flage++;					
				}
				
		}
			if(flage==L)
			{
				System.out.println("Given Word is Palindrome");
			}
			else
			{
				System.out.println("Given Word is Not a Palindrome");
			}
		}	
	}

