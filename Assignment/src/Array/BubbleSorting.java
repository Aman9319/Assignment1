package Array;

public class BubbleSorting 
{
public static void main(String[] args)
{

	int a[]= {78,13,53,23,54,45,2,6};
	
	System.out.println("Array before Sorting :");
	
	for (int i = 0 ; i < a.length ; i++) 
	{
		System.out.println(i+":"+a[i]);
		
	}
	for (int i = 0; i < a.length-1; i++) 
	{
		for (int j = 0; j < a.length-1-i; j++) 
		{		
			if(a[j]>a[j+1])
			{
				a[j]=a[j]+a[j+1];
				a[j+1]=a[j]-a[j+1];
				a[j]=a[j]-a[j+1];
			}			
		}
	}
	System.out.println("After bubble Sorting :");
	
	for (int i = 0; i < a.length; i++) 
	{
	System.out.println(i+" :"+a[i]);	
	}
}
	
}
