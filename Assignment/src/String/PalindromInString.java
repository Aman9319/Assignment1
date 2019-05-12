package String;

public class PalindromInString 
{
public static void main(String[] args)
{
	String str="Pushpendra";

	char[] c= str.toCharArray();
	String str1="";
	for (int i = c.length-1; i >=0 ; i--)
	{
		str1=str1+c[i];
	}
	System.out.println(str1);
	if (str.equalsIgnoreCase(str1))
	{
		System.out.println("Entered string is palindrome ");
		
	}
	else
	{
		System.out.println("Entered string is not palindrome ");
		
	}

}
}
