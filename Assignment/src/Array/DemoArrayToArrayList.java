package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayToArrayList
{
	public static void main(String[] args) {
		
	

	String stringarr []= {"p","U","s","p","e","n","d","r","a"};
	    
	ArrayList<String> list=new ArrayList<>(Arrays.asList(stringarr));
	
	System.out.println("Object in ArrayList is :"+list);//Object in ArrayList is :[p, U, s, p, e, n, d, r, a]
}
}
