//WAP to extract number from string
package String;

public class ExtractNumberFromString 
{

	public static void main(String[] args) 
	{
	
	String str= "you are about to delete 300 task ";
//	String[] str1 = str.split(" ");
		char[] str2 = str.toCharArray();
		String s1="";
		String s2="";
		
		for (int i = 0; i <str2.length; i++)
		{
			if('0'<= str2[i]&&str2[i]<='9')
			{
				s1=s1+str2[i];		
			}
			else
			{
				s2=s2+str2[i];
			}	
		}
		System.out.println("number is :"+s1);
		System.out.println("sentences is :"+s2);
		
		
	}
}
