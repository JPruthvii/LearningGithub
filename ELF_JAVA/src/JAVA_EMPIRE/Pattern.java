package JAVA_EMPIRE;

public class Pattern 
{
public static void main(String[] args) 
{
	int star=1;
	int space=3;
	for (int i = 1; i <=4; i++) 
	{
		for (int k = 0; k <=space; k++)
		{
			System.out.print(" ");
		}
		for (int j = 1; j <=star; j++) 
		{
			System.out.print("*");
		}
		
		System.out.println();
		star=star+2;
		space--;
	}
	

}
}
