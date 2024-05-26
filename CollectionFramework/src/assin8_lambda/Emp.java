package assin8_lambda;

import java.util.Comparator;

public class Emp implements Comparator<Emp>{
	int empid;
	String name;
	float salary;
	public Emp() {
		empid = 0;
		name = "";
		salary =0.f;
	}
	public Emp(int empid, String name, float salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
    public int compare(Emp o1, Emp o2) {
		
		return 0;
	}
}
