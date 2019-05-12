package Array;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class RemoveElementFromArray 
{
	public static void main(String[] args) {
		
	
int a[]= {10,20,30,40,50};

int [] a1=ArrayUtils.removeElement(a, 30);
System.out.println(Arrays.toString(a1));

//int[] intArray = { 1, 2, 3, 4, 5 };
//int[] removed = ArrayUtils.removeElement(intArray, 3);//create a new array
//System.out.println(Arrays.toString(removed));
	
}
}
