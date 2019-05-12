package Java_prog;

import java.util.Arrays;

public class DuplicatesInStr {

	public static void main(String[] args)
	{
		String s="ram is is garam garam ram ram  ";
		String [] str=s.split(" ");
		Arrays.sort(str);
		
		for (int i = 0; i < str.length; i++)
		{
			
			System.out.print(str[i]+" ,");
		}
		System.out.println();
		String dup="";
		String unq="";
		for (int i = 0; i < str.length-1; i++)
		{ 
			if (str[i].equals(str[i+1]))
			{
				dup=dup+", "+str[i];
			}
			else
			{
				unq=unq+", "+str[i];
			}
		}
		if (str[str.length-2].equals(str.length-1))
			dup=dup+", "+str[str.length-1];
		else
			unq=unq+", "+str[str.length-1];
		System.out.println("uniques = "+unq);
		System.out.println("duplicates = "+dup);
		

	}

}
