package assin7_comparator;

import java.util.Set;
import java.util.TreeSet;


public class DemoMain {
public static void main(String[] args) {
	Set<EmpComparator> emps=new TreeSet<>(new EmpComparator());
	emps.add(new EmpComparator(101,"Saloni",9700.9f));
	emps.add(new EmpComparator(102,"Singh",9758.3f));
	emps.add(new EmpComparator(103,"Surabhi",9272.5f));
	emps.add(new EmpComparator(104,"Sushma",9464.2f));
	emps.add(new EmpComparator(105,"Abhay",9122.7f));
	emps.add(new EmpComparator(105,"Abhay",9122.7f));
	emps.add(new EmpComparator(105,"Abhay",9122.7f));
	
	for(EmpComparator e: emps) {
		System.out.println(e);
	}
}
}
