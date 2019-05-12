package Array;

public class ReverseAnArray 
{
public static void main(String[] args) 
{

	int [] a= {10,20,30,40};
	int [] b=new int[a.length];
	
	for (int i=a.length-1,j=0;i>=0;i--) 
	{
	    b[j++]=a[i];	
	}	
	System.out.println("Array in reverse order =");
	for (int i = 0; i < b.length; i++)
	{
	System.out.println(i+":"+b[i]);
	}

}
}
