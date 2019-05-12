package Array;

import java.util.Arrays;

public class DemoTwoDimentionalArray3 
{
public static void main(String[] args) 
{

	int arr[][]=new int[4][3];
	int a=10;
	//System.out.println(arr.length);
	for (int i = 0; i < arr.length; i++) 
	{
		//System.out.println(arr[i].length);
	for (int j = 0; j < arr[i].length; j++)
	{
	arr[i][j]=a;
	a=a+10;	
	}
	}
	
	for (int i = 0; i < arr.length; i++)
	{
	for (int j = 0; j < arr[i].length; j++) 
	{
	System.out.print(arr[i][j]+" ");	
	}
	System.out.println();
	}
	
}
}
