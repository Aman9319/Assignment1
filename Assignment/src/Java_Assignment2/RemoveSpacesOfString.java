//	Write a java program to remove all white spaces from a string?

package Java_Assignment2;

import java.util.Scanner;

public class RemoveSpacesOfString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string  : ");
		String str = s.nextLine();
		char[] c = str.toCharArray();
		String str1 = "";
		for (int i = 0; i < c.length; i++) {
			if (i < c.length && c[i] != ' ') {
				str1 = str1 + c[i];
			}
		}
		System.out.println(str1);
		s.close();
	}

}
