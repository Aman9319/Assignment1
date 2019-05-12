//WAP to Print odd value Present in array
package Array;

public class DemoOddValueInArray {
	public static void main(String[] args)
	{
	
		int arr[]= {12,23,34,56,67,89};
		
		for (int i = 0; i < arr.length; i++)
		{
		if(arr[i]%2!=0)
		{
			System.out.println(i+":"+arr[i]);
		}			
		}
	}

}
