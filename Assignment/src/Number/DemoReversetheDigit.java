package Number;

public class DemoReversetheDigit
{
	public static int reverse(int num)
	{
		int temp=num;
		int rev=0;
		while(temp>0)
		{
			int d=temp%10;
			rev=rev*10+d;
			temp=temp/10;
		}
		return rev;
	}
public static void main(String[] args) 
{

System.out.println(reverse(12345));	
}
}
