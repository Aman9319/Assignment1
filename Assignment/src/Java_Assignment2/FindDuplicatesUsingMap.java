package Java_Assignment2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesUsingMap {

	public static void main(String[] args)
	{
		String str="hey how are you hey   i am fine how    are you";
		String arr2[]=str.split(" ");
		Arrays.sort(arr2);
           String str2="";
           for (int i = 0; i < arr2.length; i++)
        {
			str2=str2+" "+arr2[i];
		}
           String trim = str2.trim();
           System.out.println(trim);
           String arr []=trim.split(" ");
        Map<String, Integer> hm=new HashMap<>();
        for (int i = 0; i < arr.length; i++) 
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
      System.out.println(hm);
	}
 
}
