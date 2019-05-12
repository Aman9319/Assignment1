package Array;

public class DempPrintOnlyCharcter 
{
public static void main(String[] args)
{
int arr[]= {10,'a','v',4,5,6,7,'b',6,'z'};
for (int i = 0; i < arr.length; i++) 
{
	if (arr[i]>=65 &&arr[i]<=90||arr[i]>=97 &&arr[i]<=122)
	{
	System.out.println("Charcter is :"+(char)arr[i]);	
	}
}
}
}
