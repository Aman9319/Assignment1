package Number;

import java.util.Scanner;

public class DemoStrongNumber {
	public static int fact(int n)
	{
	
	int fact=1;
	for (int i=1;i<=n ;i++ )
	{
		fact=fact*i;
	}
	return fact;
	}
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
int temp=num;
int sum=0;
while (temp>0)
{
	int d=temp%10;
	   sum=sum+fact(d);
	   temp=temp/10;
}
if (num==sum)
{
	System.out.println(num+"Enter number is the strong number");
}
	else
	{
	System.out.println(num+"Enter number is not the strong number");
	}		
}

}
