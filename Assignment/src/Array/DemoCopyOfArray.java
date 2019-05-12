package Array;

import java.util.Arrays;

public class DemoCopyOfArray 
{
	public static void main(String[] args) 
	{
	int a[]= {1,2,3,4,5,6,7};	
	int[] range = Arrays.copyOfRange(a, 1, 3);
	
	System.out.println("With the help of Arrays"+Arrays.toString(range));
	System.out.println("With the help of for  :");
	for (int i = 0; i < range.length; i++) 
	{
	System.out.print(range[i]+"," );	
	}
	}

}
