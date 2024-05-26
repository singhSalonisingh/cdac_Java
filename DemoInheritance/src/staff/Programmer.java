package staff;

import utility.Employee;

public class Programmer extends Employee {
private String projectTitle;
private int extraHours;
private double chargesPerExtraHour;

public Programmer() {
	super();
}

public Programmer(String projectTitle,int extraHours,double chargesPerExtraHour,
		int eid,double basicSalary,String name,int day,int month,int year) {
	super(eid,basicSalary,name,day,month,year);
	this.projectTitle=projectTitle;
	this.extraHours=extraHours;
	this.chargesPerExtraHour=chargesPerExtraHour;
}

public String display() {
	return " Project Title: "+projectTitle+" Extra Hours: "+ extraHours +"Charges per Extra Hours: "+chargesPerExtraHour+super.display();
}
}
