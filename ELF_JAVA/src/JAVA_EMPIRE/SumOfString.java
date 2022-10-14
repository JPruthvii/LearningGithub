package JAVA_EMPIRE;

public class SumOfString 
{
	public static void main(String[] args)
	{
		String s1="s1dfe345";
		int sum=0;
		for (int i = 0; i < s1.length(); i++)
		{ char ch=s1.charAt(i);
		    if(ch<='9'&&ch>='0')
		    {
		    	sum=sum+(int)ch-48;
		    }
		}
		System.out.println(sum);
	}
}
