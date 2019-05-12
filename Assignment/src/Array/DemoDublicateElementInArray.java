package Array;

import java.util.HashSet;
import java.util.Set;

public class DemoDublicateElementInArray 
{
public static void main(String[] args)
{

	String str[]= {"Googlr","Tesla","Yahoo","Yahoo"};
	
	String dub=" ";
	
	
//	1st Way
	
	Set<String> hashSet = new HashSet<>();
	
	for (String string : str) 
	{
		if(!hashSet.add(string));
		{
			dub=dub+string;			
		}		
	}
	System.out.println("Unique Element is"+hashSet);
	System.out.println("Dublicate element is"+dub +",");
	
}
}
