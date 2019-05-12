package Array;

public class DemoSumOfArrayAndAverage
{
public static void main(String[] args)
{
int arr[]= {10,20,30,40,50};
int sum=0;
for (int i = 0; i < arr.length; i++)
{
  sum=sum+arr[i];	
}
double avg=sum/arr.length;

System.out.println("Sum of given Array is :"+sum);

System.out.println("Average of given array is:"+avg);
}
}
