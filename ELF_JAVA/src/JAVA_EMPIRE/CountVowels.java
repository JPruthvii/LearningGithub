package JAVA_EMPIRE;

public class CountVowels 
{
public static void main(String[] args) {
	String s1="india";
	String s2="";
	
	for (int i = 0; i < s1.length(); i++)
	{
		int count=0;
		char ch=s1.charAt(i); 
		for (int j = 0; j < s1.length(); j++)
		{   if(i!=j)
		{
			if(ch=='a'||ch=='i')
			{
				count++;
				break;
			}
		}
		}
		System.out.println(ch+" "+count);
	}
	
}
}
