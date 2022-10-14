package JAVA_EMPIRE;

public class RemoveDuplicateWordsInString 
{
public static void main(String[] args) {
String s1="hello hii bye tata hello bye";

String[] s2=s1.split(" ");
for (int i = 0; i < s2.length; i++) 
{
for (int j = 0; j < s2.length; j++) 
{
if(i!=j)
{
	if(s2[i].equals(s2[j]))
	{
	 s2[i]="qsp";

	}
	
}
}	
}
for (int k = 0; k < s2.length; k++)
{
	if(!s2[k].equals("qsp"))
	{
	System.out.println(s2[k]);
	}
}


}
}
