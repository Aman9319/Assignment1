//WAP to count number of 'a' present in string
package String;

public class AlphabetFromString
{
public static void main(String[] args)
{

	String s="Shankar mahadevan";
	int count=0;
	
	for (int i = 0; i < s.length(); i++)
	{
	if (s.charAt(i)=='a') 
	{
	  count++;	
	}
		
	}
	System.out.println("number of time A present in String:"+count);
	
}
}
