package Java_Assignment2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicatesInStrLineUsingMap
{
	public static void main(String[] args)
	{
		String str="hey how are you hey   i am fine how  how how how  are you";
		String arr[]=str.split(" ");
        Map<String, Integer> hm=new HashMap<>();
        for (int i = 0; i < arr.length; i++) 
        {
        	if (!arr[i].isEmpty()) 
        	{
        		if (hm.containsKey(arr[i]))
				{
					Integer value = hm.get(arr[i]);
					value++;
					hm.put(arr[i], value);
				}
				else
				{
					hm.put(arr[i], 1);
				}
			}
              			
		}
      System.out.println(hm);
	}

}
