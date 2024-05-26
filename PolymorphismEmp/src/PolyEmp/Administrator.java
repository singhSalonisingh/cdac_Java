package PolyEmp;

public class Administrator extends Employee {
	private double allowance;
	
	public Administrator() {
		super();
	}
	
	public Administrator(double allowance,int eid,double basicSalary,String name,int day,int month,int year) {
		super(eid,basicSalary,name,day,month,year);
		this.allowance=allowance;
}
	public double calculateSalary()
	{
		return basicSalary+allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	@Override
	public String toString() {
		return "Administrator ::"+super.toString()+" allowance=" + allowance + " salary =  "+calculateSalary();
	}
	
}
