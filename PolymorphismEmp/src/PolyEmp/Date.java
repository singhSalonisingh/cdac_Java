package PolyEmp;

public class Date {
private int day,month,year;
public Date() {
	
}
public Date(int day,int month,int year) {
	this.day=day;
	this.month=month;
	this.year=year;
}
public String toString() {
	return day+"/"+month+"/"+year;
}
}
