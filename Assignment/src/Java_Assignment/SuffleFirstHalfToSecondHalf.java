package Java_Assignment;

import java.util.Scanner;

public class SuffleFirstHalfToSecondHalf
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a number : ");
		int num = s.nextInt();
		String str=String.valueOf(num);
		char[] c= str.toCharArray();
		String str1="";
		String str2="";
		for(int i=0;i<c.length;i++)
		{
              if (i<str.length()/2)
              {
                  str1=str1+c[i];   
              }  
			  else
			{
			  str2=str2+c[i];
			  }
		}

           String str3=str2+str1;
		   int res=Integer.parseInt(str3);
		   System.out.println("resut = "+res);
	 }
}
