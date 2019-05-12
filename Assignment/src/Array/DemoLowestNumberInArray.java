package Array;

public class DemoLowestNumberInArray 
{
public static void main(String[] args)
{
int arr []= {3,4,5,8,6};	

int lowestNumber=arr[0];
for (int i = 0; i < arr.length; i++)
{
	if(lowestNumber>arr[i])
	{
		lowestNumber=arr[i];
	}
	
}

System.out.println("Lowest number is  :"+lowestNumber);
}
}
