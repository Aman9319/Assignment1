package Java_Assignment2;

import java.util.Arrays;

public class DuplicateInStrLine 
{
	public static void main(String[] args) 
	{
		String s="aman is is aman garam garam";
		String [] str=s.split(" ");
		Arrays.sort(str);
		String  duplicates= "";
		String unique= "";
		
		System.out.println(str.length);
		
		for (int i = 0; i < str.length-1; i++)
		{
			
			if(str[i].equals(str[i+1]))
			{
				duplicates=duplicates+" ,"+str[i];
			}
			else
			{
				unique=unique+" ,"+str[i];
			}
		}

		
			System.out.println("duplicate  =  "+duplicates);
			System.out.println("unique  =  "+unique);
		

	}

}
