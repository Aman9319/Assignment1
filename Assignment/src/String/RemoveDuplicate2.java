package String;

import java.util.Arrays;

public class RemoveDuplicate2 
{
public static void main(String[] args) {
	
	String s="hi how are you  yoy are mohan  you you zo";
	String[] str = s.split(" ");
	Arrays.sort(str);
	String dup="";
	String uni="";
	
	for (int i = 0; i < str.length-1; i++) 
	{
		if (str[i].equals(str[i+1])) 
		{
			dup=dup+","+str[i];
		}
		else
		{
			uni=uni+","+str[i];
		}
	}
	if(str[str.length-2].equals(str[str.length-1]))
	{
		dup=dup+","+str[str.length-1];
	}
	else
	{
		uni=uni+","+str[str.length-1];
	}
	
	
	System.out.println(dup);
	System.out.println(uni);
	
}
}
