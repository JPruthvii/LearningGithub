package JAVA_EMPIRE;

public class A {
public static void main(String[] args) {
	String s="Hello hi Hello How are Hello You";
	String s1[]=s.split(" ");
	String s2="";
	for(int i=0;i<s1.length;i++){
		if(!s2.contains(s1[i])){
			s2=s2+s1[i]+" ";
		}
	}
	System.out.println(s2);
}
}
