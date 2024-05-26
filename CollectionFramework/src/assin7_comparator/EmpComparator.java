package assin7_comparator;

import java.util.Comparator;

public class EmpComparator implements Comparator<EmpComparator> {
	int empid;
	String name;
	float salary;
	public EmpComparator() {
		empid = 0;
		name = "";
		salary =0.f;
	}
	public EmpComparator(int empid, String name, float salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmpComparator [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compare(EmpComparator o1, EmpComparator o2) {
		int diff=0;
		if(o1.salary>o2.salary)
		diff=-1;
		else if(o1.salary<o2.salary)
			diff=1;
		else if(o1.salary==o2.salary) {
			diff=o1.name.compareTo(o2.name);//compareTo method is from String
			if(diff==0)
				diff=o1.empid-o2.empid;
			}
		
		return diff;
	}
	
}
