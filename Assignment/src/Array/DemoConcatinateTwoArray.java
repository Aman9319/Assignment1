package Array;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class DemoConcatinateTwoArray
{
	public static void main(String[] args) {
		
	

	int a1[]= {10,20,30};
	int a2[]= {40,50};
	int[] addAll = ArrayUtils.addAll(a1, a2);
	
	String concatination=Arrays.toString(addAll);
	System.out.println("concatinated array is :"+concatination);//concatinated array is :[10, 20, 30, 40, 50]
}
}
