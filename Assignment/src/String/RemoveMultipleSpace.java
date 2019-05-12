//WAP to remove spaces between the worlds
package String;

public class RemoveMultipleSpace
{
	public static void main(String[] args)
	{
	String str="Hello i      am               learning   selenium and java ";
	String[] s = str.split(" ");
	String str1="";
	
	for (int i = 0; i < s.length; i++) 
	{	
		if (s[i].length()>0)
		{	
			str1+=s[i]+" ";
		}
	}
	System.out.println(str1);
		
	}
}
