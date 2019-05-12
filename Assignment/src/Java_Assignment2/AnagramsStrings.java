//Write a program to check whether given two strings are anagrams?
package Java_Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsStrings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string1  : ");
		String str1 = s.next();
		char[] c1 = str1.toCharArray();
		System.out.println("Enter the string2  : ");
		String str2 = s.next();
		int count = 0;
		char[] c2 = str2.toCharArray();
		if (c1.length != c2.length) {
			System.out.println("Entered strings are not Anagrams");
		}
		Arrays.sort(c1);
		Arrays.sort(c2);
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] == c2[i]) {
				count++;
			}
		}
		if (count == c1.length) {
			System.out.println("Entered strings are  Anagrams");
		} else {
			System.out.println("Entered strings are not Anagrams");
		}

	}

}
