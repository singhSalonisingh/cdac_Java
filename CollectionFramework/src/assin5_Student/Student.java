package assin5_Student;

public class Student {
int studentid;
String name;
String city;
float percentage;
public Student() {
	studentid = 0;
	name = "";
	city ="";
	percentage = 0.0f;
}

public Student(int studentid, String name, String city, float percentage) {
	this.studentid = studentid;
	this.name = name;
	this.city = city;
	this.percentage = percentage;
}


public String toString() {
	return "Student [studentid=" + studentid + ", name=" + name + ", city=" + city + ", percentage=" + percentage + "]";
}
 
public int hashCode() {
	int code=0;
	if(city.equalsIgnoreCase("Lucknow"))
		code=10;
	else if(city.equalsIgnoreCase("Pune"))
		code=20;
	else if(city.equalsIgnoreCase("Patna"))
		code=30;
	else if(city.equalsIgnoreCase("Banaras"))
		code=40;
	else if(city.equalsIgnoreCase("Ayodhya"))
		code=50;
	return code;
	
}
/*public int hashCode() {
	String str=city.toUpperCase();
	int ch=0;
	for(int i=0;i<str.length();i++) {
		ch +=str.charAt(i);
	}
	return ch;
}*/

public boolean equals(Object obj) {
	boolean flag=false;
	Student s=null;
	if(obj instanceof Student)
		s=(Student)obj;
	//if(center_code == s.center_code && course_code == s.course_code && PRN.equals(s.PRN) && name.equals(s.name))
	if(city.equals(s.city)&&studentid==s.studentid&&name.equals(s.name)&&percentage==s.percentage)
		flag =true;
	return flag;
}


}
