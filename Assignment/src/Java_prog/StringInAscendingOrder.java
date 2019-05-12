package Java_prog;

import java.util.Arrays;

public class StringInAscendingOrder {
	public static void main(String[] args)
	{
		String s="ram is is gazam gauam ram ram  ";
		String [] str=s.split(" ");
		String temp="";
		System.out.println(str);
		for (int i = 0; i < str.length-1; i++)
		{
			for (int j = 0; j < str.length-1-i; j++)
			{
				if (str[j].length()>str[j+1].length())
				{				
					temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;			
				}
			}
		}
		for (int i = 0; i < str.length; i++)
		{
			System.out.print(str[i]+", ");
		}
	}
}
