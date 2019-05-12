package Array;

public class DemoOddElementInArray 
{
public static void main(String[] args)
{

	int a[]= {10,20,30,40,50};
	
	System.out.println("Odd element in Array is =");
//	for (int i = 0; i < a.length; i++)
//	{
//	 if (i%2!=0)
//	 {
//		 System.out.println(i+" :"+a[i]);			
//	 }
//		
//	}
	
	//2nd Way
	
	for (int i = 1; i < a.length; i+=2)
	{
	
		System.out.println(i+" :"+a[i]);
	}
}
}
