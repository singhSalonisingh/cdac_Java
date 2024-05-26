package assin9_acen_decen;

import java.util.Set;
import java.util.TreeSet;

public class DemoMain {
public static void main(String[] args) {
	Set<Empl> emps=new TreeSet<>(new Empl());
	emps.add(new Empl(101,"Saloni",9700.9f,90));
	emps.add(new Empl(104,"Sushma",9464.2f,13));
	emps.add(new Empl(105,"Abhay",9122.7f,14));
	emps.add(new Empl(105,"Abhay",9122.7f,85));
	emps.add(new Empl(102,"Singh",9758.3f,11));
	emps.add(new Empl(103,"Surabhi",9272.5f,62));
	emps.add(new Empl(105,"bhay",9122.7f,14));
	
	for(Empl e: emps) {
		System.out.println(e);
	}
}
}
