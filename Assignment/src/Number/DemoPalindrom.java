package Number;

public class DemoPalindrom 
{
	public static void palind(int num)
	{
		int temp=num;
		int rev=0;
		while(temp>0)
		{
			int d=temp%10;
			 rev=rev*10+d;
			 temp =temp/10;	
		}		
		if (rev==num)
		{
			System.out.println("number is panidrim");			
		}
		else
		{
			System.out.println("Number is not palindrom");
		}		
	}
public static void main(String[] args) 
{
	palind(12331);

	
}
}
