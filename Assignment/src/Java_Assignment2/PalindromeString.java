//Write a program to check whether given string is a palindrome or not?
package Java_Assignment2;

import java.util.Scanner;

public class PalindromeString 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a string  : ");
		String str = s.next();
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
