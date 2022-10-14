package JAVA_EMPIRE;

public class Two_dim 
{
public static void main(String[] args) {
	int[]arr={1,2,3};
	int[]abb={1,2,3,4};
	int length=0;
	int[]acc;
	if(arr.length>abb.length)
	{
		length=arr.length;
		acc=new int[length];
		for (int i = 0; i < abb.length;i++)
		{
			acc[i]=abb[i];
		}
		
	}
	else
	{
		length=abb.length;
		acc=new int[length];
		for (int i = 0; i < arr.length;i++)
		{
			acc[i]=arr[i];
		}
	}
	
	
	
	for (int i = 0; i < arr.length; i++) 
	{
		arr[i]=arr[i]+acc[i];
		System.out.println(arr[i]);
	
	}
	
}
}
