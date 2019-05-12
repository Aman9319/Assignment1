package Array;

public class DemoTwoDimentionalArray4
{
public static void main(String[] args)
{
int arr[][]= {{10,20,30},{40,50,60},{70,80,90}};	
for (int i = 0; i < arr.length; i++)
{
for (int j = 0; j < arr[i].length; j++) 
{
	if (i==0||i==arr.length-1||j==0 &&i!=0||j==arr[i].length-1||i==1 &&j!=arr[i].length-1&&j!=0) 
		
	{
		System.out.print(arr[i][j]+" ");	
	} 
	else
	{
        System.out.print(" ");
	}
	
}	
System.out.println();
}
}
}
