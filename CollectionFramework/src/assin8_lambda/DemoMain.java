package assin8_lambda;

import java.util.Set;
import java.util.TreeSet;

public class DemoMain {
public static void main(String[] args) {
	Set<Emp> emps=new TreeSet<>((Emp o1, Emp o2)->{
		int diff=0;
		if(o1.salary>o2.salary)
		diff=-1;
		else if(o1.salary<o2.salary)
			diff=1;
		else if(o1.salary==o2.salary) {
			diff=o1.name.compareTo(o2.name);
			if(diff==0)
				diff=o1.empid-o2.empid;
			}
		
		return diff;
	});
	
	emps.add(new Emp(101,"Saloni",9700.9f));
	emps.add(new Emp(102,"Singh",9758.3f));
	emps.add(new Emp(103,"Surabhi",9272.5f));
	emps.add(new Emp(104,"Sushma",9464.2f));
	emps.add(new Emp(105,"Abhay",9122.7f));
	emps.add(new Emp(105,"Abhay",9122.8f));
	emps.add(new Emp(105,"Abhay",9122.7f));
	
	for(Emp e: emps) {
		System.out.println(e);
	}
}
}
