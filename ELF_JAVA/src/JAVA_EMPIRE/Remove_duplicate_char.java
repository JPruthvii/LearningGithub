package JAVA_EMPIRE;

public class Remove_duplicate_char
{
public static void main(String[] args) 
{
	String s1="abcabcabc";
   char[]arr=s1.toCharArray();
   for (int i = 0; i < arr.length; i++)
   {
	for (int j =0 ; j < arr.length; j++) 
	{
		if(i!=j)
		{
          if(arr[i]==arr[j])
          {
        	  arr[i]='0';
          }
		}
	 }
   }
	for (int k = 0; k < arr.length; k++) 
		
	{
    if(arr[k]>=97&&arr[k]<=122)
    {
    	System.out.println(arr[k]);
    }
	}
}
}
