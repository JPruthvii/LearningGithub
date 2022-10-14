package JAVA_EMPIRE;

public class SumOfNumberInString 
{
public static void main(String[] args) 
{
String s1="19sept2022";
String Stringnumber="";
int sum=0;
for (int i = 0; i <s1.length(); i++) 
{
	if(s1.charAt(i)>=47&&s1.charAt(i)<=57)
	{
		Stringnumber=Stringnumber+s1.charAt(i);
	}
}
int digit=Integer.parseInt(Stringnumber);
while(digit!=0)
{
	int rem=digit%10;
	sum=sum+rem;
	digit=digit/10;
}
System.out.println(sum);
}
}
