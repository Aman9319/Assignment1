package String;

public class DemoReverseSpeciedString 
{
public static void main(String[] args) 
{
 String str="JAVA PROGRAMMING";	

   String substring = str.substring(0, 4);
   String substring2 = str.substring(5, str.length());
   String str1=" ";
   String str2=" ";
   for (int i = substring.length()-1; i>=0; i--) 
   {
	str1=str1+substring.charAt(i);
   }
   for (int i = 0; i < substring2.length(); i++)
   
   {
	   str2=str2+substring2.charAt(i);
   }
   System.out.println(str1+" "+str2);
}
}
