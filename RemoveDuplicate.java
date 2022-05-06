package Week2Day2;

public class RemoveDuplicate 
{

	public static void main(String[] args) 
	{
		   String[] text={"We","learn","java","basics","as","part","of","java","sessions","in","java","week1"};
	       int count=text.length;
	       int R=0;
	       System.out.println("String Count  : " + count);
    	   for(int i=0; i<count; i++)
	       {
	    	   for(int j=i+1; j<count; j++)
	    	   {
	    		   if(text[i]==text[j])
	    		   {
	    			   R++;
	    			   if(R>1)
	    			   {
	    				   text[i]=" ";
	    			   }
	    		   }

	    	   }

	       }
	       for(int i=0; i<count; i++)
	       {
	    	   System.out.print(text[i]+" ");
	       }

	 
	    }
	}