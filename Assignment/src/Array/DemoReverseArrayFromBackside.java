package Array;

import java.util.Arrays;

public class DemoReverseArrayFromBackside
{
public static void main(String[] args) 
{
int arr[]= {1,2,3,4,5,6};	
int arr1[]=new int[arr.length];
for (int i = 0 ,j=0; i < arr.length/2; i++) 
{
	arr1[j++]=arr[i];
}
//System.out.println(Arrays.toString(arr1));

for (int i = arr.length-1 ,j=arr1.length/2; i>=arr.length/2 ; i--)
{
	arr1[j++]=arr[i];
}

for (int i = 0; i < arr1.length; i++)
{

	System.out.print(arr1[i]);
}

}
}
