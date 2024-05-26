package utility;

public class Employee extends Person{
private int eid;
private double basicSalary;

public Employee() {
	super();//no argument constructor of base class
}

public Employee(int eid,double basicSalary,String name,int day,int month,int year) {
	super(name,day,month,year);
	this.eid=eid;
	this.basicSalary=basicSalary;
}

public String display() {
	return "employee id: "+eid+" salary: "+ basicSalary+super.display();
}
}
