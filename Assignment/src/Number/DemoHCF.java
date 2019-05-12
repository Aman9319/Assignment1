package Number;

public class DemoHCF
{
public static void main(String[] args) 
{

	int a=10;
	int b=20;
	int hcf=1;
	for (int i = 1; i < 10; i++) 
	{
	if (a%i==0 &&b%i==0)
	{
		hcf=i;
	}	
	}
	System.out.println("hcf is"+hcf);
}
}
