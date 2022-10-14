package JAVA_EMPIRE;

public class AddIntString 
{
	public static void main(String[] args) 
	{
		String s1="ash2h78";
		String s2="";
		for (int i = 0; i < s1.length(); i++)
		{ char ch=s1.charAt(i);
		if(Character.isDigit(ch)){
			s2=s2+ Character.getNumericValue(ch);
		}
		}
		System.out.println(Integer.parseInt(s2));
	}

}
