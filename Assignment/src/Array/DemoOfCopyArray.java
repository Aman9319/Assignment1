package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoOfCopyArray 
{
public static void main(String[] args) 
{
	//1st Way

	int arr[]= {10,20,30,40,50};
	
	int arr1[]=Arrays.copyOfRange(arr, 0, 3);
	
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(arr1));
	//2nd way
	
	ArrayList<Object> arrayList = new ArrayList<>();
	
	for (int i = 0; i < arr.length/2+1; i++) 
	{
		arrayList.add(arr[i]);
		
	}
	System.out.println(arrayList);
}
}
