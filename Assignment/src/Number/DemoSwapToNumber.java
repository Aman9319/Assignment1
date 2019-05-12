package Number;

public class DemoSwapToNumber
{
public static void swapNum( int x,int y)
{
	int temp=0;
	temp=x;
	x=y;
	y=temp;
	
	System.out.println("x :"+x);
	System.out.println("y :"+y);
		
}
public static void main(String[] args)
{
swapNum(10,20)	;
}
}
