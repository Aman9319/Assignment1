package Array;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class DemoArrayReverse 
{
	public static void main(String[] args) {
		
	
    
//	int array[]= {10,20,30,40};
//	 ArrayUtils.reverse(array);
//	 System.out.println(Arrays.toString(array));//[40, 30, 20, 10]
//	 Arrays.sort(array);
//	 System.out.println(Arrays.toString(array));//[10, 20, 30, 40]
		
		
		String s[]= {"a","nm","a","no"};
		
		ArrayUtils.reverse(s);
		System.out.println("Array String in reverse order"+Arrays.toString(s));
		
		Arrays.sort(s);
		System.out.println("Array String in sorted order"+Arrays.toString(s));
		
	 
}
}
