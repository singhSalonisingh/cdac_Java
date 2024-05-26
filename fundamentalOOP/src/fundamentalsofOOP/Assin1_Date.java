package fundamentalsofOOP;

public class Assin1_Date {
private int day,month,year;

public void setDate(int day,int month,int year) {
	this.day=day;
	this.month=month;
	this.year=year;
}
public void getDate() {
	System.out.println(day+"/"+month+"/"+year);
}
//getter setter

public int getDay() {
	return day;
}

public int getMonth() {
	return month;
}

public int getYear() {
	return year;
}



public static void main(String[] args) {
	Assin1_Date d=new Assin1_Date();
	Assin1_Date d1=new Assin1_Date();
	d.setDate(17, 04, 2024);
	d.getDate();
	d1.setDate(16, 04, 2024);
	d1.getDate();
	d1.getDay();
	d1.getMonth();
	d1.getYear();
}
}
