package Number;

public class DemoCountNumberOfDigit 
{
	public static int count(int num)
	{
		int count=0;
		int temp=num;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		return count;
	}
public static void main(String[] args)
{

	System.out.println(count(1234));
}
}
