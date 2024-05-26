package assin5_Student;

import java.util.HashSet;
import java.util.Set;

public class DemoMain {
public static void main(String[] args) {
	Set<Student> st_set=new HashSet<>();
	st_set.add(new Student(20,"Lucknow","Singh",98.0f));
	st_set.add(new Student(10,"Pune","Saloni",99.4f));
	st_set.add(new Student(30,"Patna","Sushma",95.4f));
	st_set.add(new Student(20,"Banaras","Abhay",89.0f));
	st_set.add(new Student(50,"Ayodhya","Surabhi",49.0f));
	st_set.add(new Student(10,"Pune","Saloni",99.4f));
	for(Student st: st_set) {
		System.out.println(st);
	}
}
}
