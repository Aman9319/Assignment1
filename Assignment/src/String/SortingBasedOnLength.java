//WAP to sort the sentence based on the lenght of the world
package String;

public class SortingBasedOnLength {

	public static void main(String[] args)
	{
		String str="today is the bright sunday ";
		String[] s = str.split(" ");
		String temp="";	
		for (int i = 0; i < s.length-1; i++) 
		{
			for (int j = 0; j < s.length-1-i; j++) 
			{			
				if(s[j].length()>s[j+1].length())
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;					
				}
			}			
		}
		System.out.println("Sorted sentence based on the length");
		for (int i = 0; i < s.length; i++)
		{		
		System.out.print(s[i]+",");
	    }

}
}
