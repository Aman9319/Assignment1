package Number;

public class ExtractDigit {
	public static void digit(int num)
	{
		int temp=num;
		while(temp>0)
			{
			int d=temp%10;
			temp= temp/10;
			System.out.println(d);
			}		
	}
public static void main(String[] args)
{

	digit(123);
}
}
