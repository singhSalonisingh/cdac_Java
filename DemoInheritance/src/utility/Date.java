package utility;

public class Date {
private int day,month,year;
public Date() {
	day=month=year=0;
}
public Date(int d,int m,int y) {
	day=d;
	month=m;
	year=y;
}
public String display() {
	return " Date: "+day+"/"+month+"/"+year;
}
}
