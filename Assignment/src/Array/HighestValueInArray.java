package Array;

public class HighestValueInArray 
{
public static void main(String[] args)
{

	int a[]= {20,30,10,-80};
	int highValue=a[0];
	for (int i = 0; i < a.length; i++)
	{	
		if (highValue<a[i]) 
		{
		highValue=a[i];	
		}
	}
	System.out.println("Highest value in the array object is :"+highValue);
}
}
