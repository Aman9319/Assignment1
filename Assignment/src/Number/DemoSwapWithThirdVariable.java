package Number;

public class DemoSwapWithThirdVariable 
{
public static void swapDigit(int x,int y)
{
  x=x+y;
  y=x-y;
  x=x-y;
  
  System.out.println("X :"+x);
  System.out.println("Y :"+y);
	
}
public static void main(String[] args)
{

	swapDigit(10,20);
}
}
