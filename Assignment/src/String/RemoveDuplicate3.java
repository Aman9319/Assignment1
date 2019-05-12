package String;

public class RemoveDuplicate3 
{
public static void main(String[] args) 
{

	String s="amana";
	String dup=" ";
	String uni=" ";
	
	for (int i = 0; i <s.length(); i++)
	{
	if (s.indexOf(s.charAt(i))!=s.lastIndexOf(s.charAt(i))) 
	{
	      dup=dup+","+(Character.toString(s.charAt(i)))	;
	}
	else
	{
		   uni=uni+","+Character.toString(s.charAt(i));
	}
	}
	System.out.println("uni :"+uni);
	System.out.println("dupl :"+dup);
			
}
}
