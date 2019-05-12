package Array;

public class DemoReverseFromFrontSide
{
public static void main(String[] args)
{
int arr[]= {1,2,3,4,5,6};
int arr1[]=new int[arr.length] ;

for (int i = arr1.length/2-1,j=0; i >=0; i--) 
{
arr1[j++]=arr[i];	
}
for (int i =arr1.length/2,j=arr1.length/2; i < arr1.length; i++) 
{
arr1[j++]=arr[i];	
}
for (int i = 0; i < arr1.length; i++)
{
	System.out.println(arr1[i]);
	
}
}
}
