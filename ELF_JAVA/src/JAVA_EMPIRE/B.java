package JAVA_EMPIRE;

import java.util.Collections;
import java.util.LinkedList;

public class B implements Comparable{
	String name;
	double salary;
	int eid;
	
public B(String name, double salary, int eid) {
	
		this.name = name;
		this.salary = salary;
		this.eid = eid;
	}
public String toString(){
	return name+" "+eid+" "+salary;
}
public int compareTo(Object obj){
	B b1=(B)obj;
	if(this.salary==b1.salary){
		return 0;
	}
	else if(this.salary>b1.salary)
		return -1;
	else
		return 1;
}

public static void main(String[] args) {
	LinkedList<B> data=new LinkedList();
	data.add(new B("Khushi",29000,3));
	data.add(new B("Manoj",30000,1));
	data.add(new B("Madhu",31000,2));
    System.out.println(data);
	Collections.sort(data);
	for(B detail:data){
		System.out.println(detail);
	}
}
}
