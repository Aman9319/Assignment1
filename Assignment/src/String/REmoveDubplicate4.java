package String;

import java.util.Arrays;

public class REmoveDubplicate4
{
	public static void main(String[] args)
	{
		String str="today is the bright sunday sunday monday monday ";
		String[] s = str.split(" ");
		Arrays.sort(s);
		String dup="";
		String uni="";
		for (int i = 0; i < s.length-1; i++) 
		{
				if (s[i].compareToIgnoreCase(s[i+1])==0) 
				{
				dup=dup+","+s[i];	
				}
				else
				{
					uni=uni+","+s[i];
				}
		}
//		if(s[s.length-2].compareToIgnoreCase(s[s.length-1])==0)
//		{
//		
//			dup=dup+","+s[s.length-1];
//		}
//		else
//		{
//			uni=uni+","+s[s.length-1];
//		}
			
		
		System.out.println("duplicate element is :");
		System.out.println(dup);
		System.out.println("Unique element is:");
		System.out.println(uni);

		
	}

}
