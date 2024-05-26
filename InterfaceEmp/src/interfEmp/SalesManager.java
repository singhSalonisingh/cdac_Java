package interfEmp;

public class SalesManager extends Employee implements iTraveller{
private double salesTarget;
private double perCommission;
public SalesManager() {
	
}

public SalesManager(double salesTarget,double perCommission,int eid,double basicSalary,String name,int day,int month,int year) {
	super(eid,basicSalary,name,day,month,year);
	this.salesTarget=salesTarget;
	this.perCommission=perCommission;
}
public double calculateSalary()
{
	return basicSalary+(salesTarget*(perCommission/100));
}

public double getSalesTarget() {
	return salesTarget;
}
public String getPassportDetails() {
	return "passportDetails";
}

 public int TravelHours() {
	 return 2;
}
public String toString() {
	return "SalesManager :: "+super.toString()+"salesTarget=" + salesTarget + ", perCommission=" + perCommission +" salary = "+calculateSalary();
}
}
