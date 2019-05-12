//Write a java program to find duplicate characters in a string?
package Java_Assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateCharInString {

	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a string  : ");
		String str1 = s.nextLine();
		String[] c= str1.split(" ");

		ArrayList<String>al1=new ArrayList<>();
		ArrayList<String>al2=new ArrayList<>();
		for (int i = 0; i < c.length; i++)
		{
			if (al2.contains(c[i]))
			{
			 	al1.add(c[i]);
			}
			else
			{
			al2.add(c[i]);
			}
		}
		System.out.println("unique characters in string = "+al2);
		System.out.println("Duplicates characters in String = "+al1);
		System.out.println(al1.size());
		System.out.println(al2.size());

	}

}
