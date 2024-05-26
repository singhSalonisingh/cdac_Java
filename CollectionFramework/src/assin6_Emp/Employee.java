package assin6_Emp;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
int empid;
String name;
float salary;
public Employee() {
	empid = 0;
	name = "";
	salary =0.f;
}
public Employee(int empid, String name, float salary) {
	this.empid = empid;
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
}
@Override
public int compareTo(Employee o) {//object of class 
int diff=0;
if(this.salary>o.salary)
	diff=-1;
else if(this.salary<o.salary)
	diff=1;
else if(this.salary==o.salary)
{
	diff=this.name.compareTo(o.name);
	if(diff==0)
		diff=this.empid-o.empid;
	}
	return diff;
}



}
