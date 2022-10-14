package JAVA_EMPIRE;

import java.util.LinkedHashMap;

public class CountDuplicate 
{
	public static void main(String[] args) {
		String s1="hi hello bye hi bye";
		String[]arr=s1.split(" ");
		for (int i = 0; i < arr.length; i++) 
		{int count=1;
		for (int j = 0; j < arr.length; j++) {
			if(i!=j){
				if(arr[i].equals(arr[j]))
				{
					count++;
					arr[j]="";  
				}}
		}
		if(!arr[i].equals(""))
			System.out.println(count+" "+arr[i]);

		}
	}
}
