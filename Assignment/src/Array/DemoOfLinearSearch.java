package Array;

import java.util.Scanner;

public class DemoOfLinearSearch 
{
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Number");
	int int1 = s.nextInt();
	boolean flag=true;
	int a[]= {10,20,30,40,50};
	for (int i = 0; i < a.length; i++) 
	{
		if (a[i]==int1)
		{
		System.out.println("Key successfully found at the position :"+(i+1));	
		flag=false;
		break;
		}
	}
	if(flag)
	{
		System.out.println("Key not found");
	}
}
}
