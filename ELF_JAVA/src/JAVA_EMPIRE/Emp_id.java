package JAVA_EMPIRE;

import java.util.ArrayList;
import java.util.Collections;

public class Emp_id implements Comparable<Emp_id>
{
	 String emp_name;
	 String emp_id;
	int emp_sal;
	Emp_id(String emp_name,String emp_id,int emp_sal)
	{   
		this.emp_name=emp_name;
		this.emp_id=emp_id;
		this.emp_sal=emp_sal;
	}

public static void main(String[] args)
{
	ArrayList<Emp_id> a1=new ArrayList<Emp_id>();
	Emp_id emp1=new Emp_id("jp","123",6);
	a1.add(emp1);
	Emp_id emp2=new Emp_id("jiji","678",5);
	a1.add(emp2);
	System.out.println(a1);
  
	
	
}

@Override
public int compareTo(Emp_id o) {
	// TODO Auto-generated method stub
	return 0;
}
}
