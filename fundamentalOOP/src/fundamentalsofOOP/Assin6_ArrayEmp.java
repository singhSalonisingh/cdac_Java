package fundamentalsofOOP;

import java.util.Scanner;

public class Assin6_ArrayEmp {
private int eid;
private String name;
private double salary;
public Assin6_ArrayEmp(int i,String n,double s) {
	eid=i;
	name=n;
	salary=s;
}
public void display() {
	System.out.println("eid= "+eid+"name= "+name+"salary= "+salary);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int eid;
	String name;
	double salary;
	Assin6_ArrayEmp[] a=new Assin6_ArrayEmp[3];
	
	for(int i=0;i<a.length;i++) {
		System.out.println("eid");
		eid=sc.nextInt();
		System.out.println("name");
		name=sc.next();
		System.out.println("salary");
		salary=sc.nextDouble();
		a[i]=new Assin6_ArrayEmp(eid, name, salary);
	}
	for(int i=0;i<a.length;i++) {
		a[i].display();
	}
}
}
