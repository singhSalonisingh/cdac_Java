package PolyEmp;

public class Programmer extends Employee{
private String projectTitle;
private int extraHours;
private double chargesPerExtraHours;
public Programmer() {
	
}
public Programmer(String projectTitle,int extraHours,double chargesPerExtraHours,int eid,double basicSalary,String name,int day,int month,int year) {
	super(eid,basicSalary,name,day,month,year);
	this.projectTitle=projectTitle;
	this.extraHours=extraHours;
	this.chargesPerExtraHours=chargesPerExtraHours;
}
public double calculateSalary()
{
	return basicSalary+(extraHours*chargesPerExtraHours);
}

public String getProjectTitle() {
	return "your project title is: "+projectTitle;
}
public String toString() {
	return "Programmer :: "+super.toString()+"projectTitle=" + projectTitle + ", extraHours=" + extraHours + ", chargesPerExtraHours="
			+ chargesPerExtraHours + " salary = "+calculateSalary();
}


}
