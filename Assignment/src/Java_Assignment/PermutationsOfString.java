package Java_Assignment;

import java.util.Scanner;

public class PermutationsOfString 
{
	public static void PermutationsStr(String stra, String strb) 
	 {
	 if (strb.length() <= 1)
	 System.out.println(stra + strb);
	 else
	 for (int i = 0; i < strb.length(); i++) 
	 {
	 try
	 {
	 String Str1 = strb.substring(0, i) + strb.substring(i + 1);
	 PermutationsStr(stra + strb.charAt(i), Str1);
	 } 
	 catch (Exception e) 
	 {
	 e.printStackTrace();
	 }
	}
 }
	 public static void main(String[] args) 
	    { 
		 
		 {
			 Scanner input = new Scanner(System.in);
			 System.out.print("Enter String: ");
			 String str = input.next();
			 PermutationsStr("", str);
			 }
			 
	    } 

	 
}
