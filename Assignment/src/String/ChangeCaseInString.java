package String;

public class ChangeCaseInString 
{
public static void main(String[] args) 

{

	String s="THis Is CrAZY";

	char[] chr = s.toCharArray();
	char[] chr1=new char[chr.length];
	
	for (int i = 0; i <chr.length; i++)
	{
	   if (chr[i]>='a'&&chr[i]<='z')
	   {
		   chr1[i]=(char)(chr[i]-32);
	   }
	   else if(chr[i]>='A'&&chr[i]<='Z')
	   {
		   chr1[i]=(char)(chr[i]+32);
	   }	
	}
	for (int i = 0; i < chr1.length; i++) 
	{
	System.out.print(chr1[i]);
	
	}
}
}
