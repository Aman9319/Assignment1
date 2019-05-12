//WAP to remove duplicate element for sentences
package String;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateElement 
{
public static void main(String[] args) 

{
	
	String str1="hi my name is is pushpendra pushpendra";
	String str[]=str1.split(" ");

//	String str[]= {"google","google","facebook","yahoo","facebook"};
	Arrays.sort(str);

	ArrayList<String> uni = new ArrayList<>();
	ArrayList<Object> dup = new ArrayList<>();
	
	for (int i = 0; i < str.length; i++)
	{
		if (uni.contains(str[i]))
		{
		  dup.add(str[i]);	
		} 
		else 
		{
    uni.add(str[i]);
		}
	}
	System.out.println(uni);
	System.out.println(dup);

	}
	
	
}

