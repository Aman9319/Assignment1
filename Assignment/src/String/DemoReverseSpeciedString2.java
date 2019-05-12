package String;

public class DemoReverseSpeciedString2 
{
	public static void main(String[] args) 
	{
		String str="JAVA-PROGRAMMING";
		String[] split = str.split("-");
		String str1="";
		char[] arr1 = str.toCharArray();
		for (int i =split[0].length()-1 ; i >=0; i--)	
		{
			str1=str1+arr1[i];
//			if (i==0) 
//			{
//				str1=str1+" ";
//			}
		}
		for (int i =split[0].length(); i < arr1.length; i++) 
		{
			str1=str1+arr1[i];	
		}
		System.out.println(str1);	
	}

	
}
