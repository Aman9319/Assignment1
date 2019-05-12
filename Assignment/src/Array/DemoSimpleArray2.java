package Array;

import java.util.Arrays;

public class DemoSimpleArray2
{
public static void main(String[] args)
{
String s[]=new String[3];
s[0]="i";
s[1]="love";
s[2]="you";
for (int i = 0; i < s.length; i++)
{
System.out.println(s[i]);	
}

//=========================================
int arr[]= {10,20,30,40,50};
for (int i : arr) 
{
System.out.println(i);
}
}
}
