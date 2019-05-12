package Number;

public class DemoFeboSeries
{
	public static int fibo(int n)
	{
	int fibo=0;
	if (n==1)
	{
		return 0;
	}
	else if (n==2)
	{
		return 1;
	}
	else
	{
	int f=0,s=1;
	for (int i=3;i<=n ;i++ )
	{
		fibo=f+s;
		f=s;
		s=fibo;
	}	
	}
	return fibo;
	}
	public static void main(String[] args) 
	{
		for (int i=1;i<=10 ;i++ )
		{
			System.out.print(fibo(i )+" ");
		}
	}
}
