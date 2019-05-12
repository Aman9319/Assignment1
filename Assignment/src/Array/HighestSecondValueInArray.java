package Array;

public class HighestSecondValueInArray 
{
	public static void main(String[] args)
	{

		int a[]= {20,30,10,80,0,90,100,108,180};
		int highValue=a[0];
		int secondvalue=a[0];
		int thirdHighValue=a[0];
		
		for (int i = 0; i < a.length; i++)
		{	
			if (highValue<a[i]) 
			{
			thirdHighValue=secondvalue;
			
			System.out.println(thirdHighValue);
			secondvalue	=highValue;
			
			System.out.println(secondvalue);
			highValue=a[i];	
			}
//			else if(secondvalue<a[i])
//			{
//				thirdHighValue=secondvalue;
//				
//				secondvalue=a[i];
//			}
//			else if(thirdHighValue<a[i])
//			{
//				thirdHighValue=a[i];
//			}
		}
		System.out.println("Highest value in the array object is :"+highValue);
		System.out.println("Second Highest value in the array is :"+secondvalue);
		System.out.println("third Highest value in the array is :"+thirdHighValue);
	}
}
