package Array;

public class IndexSwapingInArray 
{
	public static void main(String[] args) {
		
	int a[]= {10,20,60,40,50,30};
	int i=2;
	int j=5;
	System.out.println("Array without swaping:");
	for(int k=0 ;k<a.length;k++)
	{
		System.out.println(k+" :"+a[k]);
	}
	
	for(int l=0 ;l<a.length;l++)
	{
		a[i]=a[i]+a[j];
		a[j]=a[i]-a[j];
		a[i]=a[i]-a[j];
	}
	System.out.println("Array ofter swaping :");
	
	for (int j2 = 0; j2 < a.length; j2++) 
	{
	System.out.println(j2+":"+a[j2]);	
	}
	
	
	}
	
}
