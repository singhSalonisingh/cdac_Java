package staff;

import utility.Employee;

public class Administrator extends Employee{

	private double allowance;
	
	public Administrator() {
		super();
	}
	
	public Administrator(double allowance,int eid,double basicSalary,String name,int day,int month,int year) {
		super(eid,basicSalary,name,day,month,year);
		this.allowance=allowance;
}
	
	public String display() {
		return "Allowance : "+allowance+super.display();
	}
}
