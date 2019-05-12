package Array;

import java.util.Arrays;

public class SimpleArray

{
public static void main(String[] args) 
{
	int a[]= {10,20,30};
	System.out.println(a);   //o/p=[I@6d06d69c
	
	//Print Array
	String string = Arrays.toString(a);
	System.out.println(string);
	System.out.println(Arrays.toString(a)); //[10, 20, 30]
	
}
}
