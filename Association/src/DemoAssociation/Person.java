package DemoAssociation;

public class Person {
private String name;
private Date dateofBirth;
public Person() {
	dateofBirth=new Date();
}
public Person(String name,int day,int month,int year) {
	this.name=name;
	dateofBirth=new Date(day, month,year);
}
public void display() {
	System.out.println("person: "+name+" DOB: "+	dateofBirth.display());
	

}
}
