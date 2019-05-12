package String;
//WAP to find number of time 'the' present in the sentences
public class ToFindNumberOfTime {
	public static void main(String[] args)
	{
	
		String s="the birds is beautiful and the girls is watchinf the birds";
		String[] str = s.split(" ");
		int count=0;
		for (int i = 0; i < str.length; i++) 
		{
			if (str[i].equals("the"))
			{
			count++;	
			}
	     }
		System.out.println(count);
//		?2nd way
		
		String [] str2= s.split("the");
		   System.out.println(str2.length);

}
}
