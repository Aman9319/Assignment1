package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Dummey 
{

	public static void main(String[] args) 
	{
		Scanner  s=new Scanner(System.in);
		System.out.println("enter the number");
		int key=s.nextInt();
        boolean flag=true ;//key is not found
		int [] a={10,20,50,5};
		for (int i=0;i<a.length ;i++ )
		{
			if (key==a[i])
			{
				System.out.println("key sucessfully found at position "+(i+1));
				flag=false;//key is found
				break;
			}
			

		}
		if (flag)
		{
			System.out.println("key not found");
		}
	
			
			
			

	}
	
			
			
			

	}


