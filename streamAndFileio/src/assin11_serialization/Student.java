package assin11_serialization;

import java.io.Serializable;

public class Student extends Person implements Serializable{
Course course;
private String PRN;
private int age;
public Student()  {
	super();
	course =new Course();
}
public Student(String name, int age, String pRN,int courseId,String courseName,double fees) {
	super(name);
	PRN = pRN;
	this.age = age;
	course =new Course(courseId,courseName,fees);
}
@Override
public String toString() {
	return "Student ::"+super.toString()+"course=" + course + ", PRN=" + PRN + ", age=" + age + "]";
}


}
