package JAVA_EMPIRE;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Count_occuring_char 
{
public static void main(String[] args) 
{
LinkedHashMap<Character, Integer> l1=new LinkedHashMap<Character, Integer>();
String s1="KARNATAKA";
for (int i = 0; i <s1.length(); i++)
{
if(!l1.containsKey(s1.charAt(i)))	
{
	l1.put(s1.charAt(i), 1);
}
else
{
	int x=l1.get(s1.charAt(i));
	x++;
	l1.put(s1.charAt(i), x);
}
}
for(Entry ch:l1.entrySet())
{
 System.out.println(ch.getKey()+" "+ch.getValue());
}
}
}


