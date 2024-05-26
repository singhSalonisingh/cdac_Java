package staff;

import utility.Employee;

public class SalesManager extends Employee{
private double salesTarget;
private double perCommission;

public SalesManager() {
	super();
}

public SalesManager(double salesTarget,double perCommission,int eid,double basicSalary,String name,int day,int month,int year) {
	super(eid,basicSalary,name,day,month,year);
	this.salesTarget=salesTarget;
	this.perCommission=perCommission;
}

public String display() {
	return " sales Target: "+salesTarget+" per Commission: "+ perCommission+super.display();
}
}
