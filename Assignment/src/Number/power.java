package Number;

public class power
{
	
	public static int pow(int x,int y)
	{
		int power=1;
		for (int j = 0; j < y; j++) 
		{
			power=power*x;	
		}
		return power;
		
	}
public static void main(String[] args)
{
	System.out.println(pow(2,3));

	
}
}
