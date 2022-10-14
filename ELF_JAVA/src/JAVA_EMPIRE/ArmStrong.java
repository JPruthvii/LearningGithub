package JAVA_EMPIRE;

public class ArmStrong 
{
public static void main(String[] args)
{
	int no=153;
	int copy=no;
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		int cube=rem*rem*rem;
		   no=no/10;
          sum =sum+cube;
	}
	if(sum==copy)
	{
	System.out.println(sum+"  armstrong");
	}
}
}
