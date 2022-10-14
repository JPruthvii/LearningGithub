package JAVA_EMPIRE;

public class TwoNumberAdditionInString
{
public static void main(String[] args) {
	String s1="21jan2022";
	int sum=0;
	int tsum=0;
	for (int i = 0; i <s1.length(); i++)
	{
		char ch=s1.charAt(i);
		if(ch>='0'&&ch<='9')
		{
			sum=sum*10+((int)ch-48);
		}
		else
		{
			tsum=tsum+sum;
			sum=0;
		}
	}
	tsum=tsum+sum;
	System.out.println(tsum);
}
}
