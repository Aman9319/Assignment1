package Java_Assignment2;

public class DuplicateOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="amanaan";
		String s1="";
		String s2="";
		
		for (int i = 0; i < s.length(); i++)
		{
			
			if(s.indexOf(s.charAt(i))!=s.lastIndexOf(s.charAt(i)))
			{
				s1=s1+" ,"+String.valueOf(s.charAt(i));
			}
			else
			{
				s2=s2+" ,"+String.valueOf(s.charAt(i));
			}
		}

		
			System.out.println("duplicate char =  "+s1);
			System.out.println("unique char =  "+s2);
		

	}

}
