package Array;

import java.util.Arrays;

public class DemoArrayInAssenAndDescen 
{
	public static void main(String[] args) {
		
	int a[]= {10,50,300,800};
	System.out.println("Arrray in random order :");
	for (int i = 0; i < a.length; i++) 
	{
		System.out.println(i+" :"+a[i]+" ");
		
	}
	
	Arrays.sort(a);
	System.out.println("Array in assceding order");
	for (int i = 0; i < a.length; i++) 
	{
		System.out.println(i+" :"+a[i]+" ");		
	}
	
	System.out.println("Array in descending order:");
	for (int i = a.length-1; i >=0; i--)
	{
	
	System.out.println(i+": "+a[i]+" ");	
	}
	
	
	

}
}
