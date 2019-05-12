package String;

import java.util.Scanner;

public class Dummy {
	
	public static void main(String[] args) 
	{

        Scanner s= new Scanner(System.in);
		System.out.println("Enter a string ");
		char a[]=s.nextLine().trim().toCharArray();
		String word="";
		String str="";
		for (int i=0;i<a.length ;i++ )
		{
			int s_index=i;
			while (i<a.length && a[i]!=' ')
			{
				word+=a[i];
				i++;
			}
			int e_index=i-1;
			str=word+' '+ str;
			word="";

		}
             System.out.println(str);

	}

}
