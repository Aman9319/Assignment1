package Array;

import java.util.Arrays;

public class DemoBinarySearch 
{
public static void main(String[] args) 
{
int a[]= {1,0,6,3,4,6,7,2};	
Arrays.sort(a);
int binarySearch = Arrays.binarySearch(a, 7);

System.out.println(binarySearch);
}
}
