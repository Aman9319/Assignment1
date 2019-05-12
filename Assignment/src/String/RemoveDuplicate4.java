package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate4 
{
public static void main(String[] args) 
{
String s="pushpendra kumar singh singh"	;
String[] str = s.split(s);
Set<String> hashSet = new HashSet<>();

ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(str));

for ( String object : arrayList) 
{

	hashSet.add(object);
	
	
}
System.out.println(hashSet);


}
}
