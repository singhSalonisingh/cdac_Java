package assin6_Emp;

import java.util.Set;
import java.util.TreeSet;

public class DemoMain {
	
public static void main(String[] args) {
	Set<Employee> emps=new TreeSet<>();
	emps.add(new Employee(101,"Saloni",9700.9f));
	emps.add(new Employee(102,"Singh",9758.3f));
	emps.add(new Employee(103,"Surabhi",9272.5f));
	emps.add(new Employee(104,"Sushma",9464.2f));
	emps.add(new Employee(105,"Abhay",9122.7f));
	emps.add(new Employee(105,"Abhay",9122.7f));
	emps.add(new Employee(105,"Abhay",9122.0f));
	
	for(Employee e: emps) {
		System.out.println(e);
	}
}
}
