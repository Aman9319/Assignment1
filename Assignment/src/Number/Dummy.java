package Number;

import java.util.Scanner;

public class Dummy 
{
	public static int power(int x,int n)
	{
		int pow=1;
	for (int i=0;i<n ;i++ )
	{
		pow=pow*x;		
	}
	return pow;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of terms required:");
		int n=s.nextInt();
		for (int i=1;i<=n ;i++ )
		{
			if (i>1)
			{
				System.out.print(",");
			}
			System.out.print(power(i,2));
		}
	}
}
