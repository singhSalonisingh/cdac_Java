package utility;

public class Person {
private String name;
private Date dateofBirth;

public Person() {
	name="NA";
	dateofBirth=new Date();
}

public Person(String _name,int _day,int _month,int _year) {
	name=_name;
	dateofBirth=new Date(_day,_month,_year);
}

public String display() {
	return " person: "+name+" DOB: "+	dateofBirth.display();
	

}
}
