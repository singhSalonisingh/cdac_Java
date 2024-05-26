package model;

import PolyEmp.Administrator;
import PolyEmp.Employee;
import PolyEmp.Person;
import PolyEmp.Programmer;
import PolyEmp.SalesManager;

public class DemoEmpPoly {
public static void main(String[] args) {
	/*Person p1=new Person();
	System.out.println(p1);
	Person p2=new Person("Saloni",15,6,2001);
	System.out.println(p2);
	
	Employee e1 =new Employee();
	System.out.println(e1);
	Employee e2=new Employee(101,8000,"Singh",15,5,2001);
	System.out.println(e2);
	
	SalesManager s1=new SalesManager(1000,3,102,5000,"Abhay",1,1,2001);
	System.out.println(s1);
	
	Programmer pr1=new Programmer("Educatree ",2,3,103,9000,"Surabhi",2,2,2002);
	System.out.println(pr1);

	Administrator a1=new Administrator(5,104,90000,"Ujjwal",9,9,2009);
	System.out.println(a1);*/
	
	Employee emp[]=new Employee[4];
	emp[0]=new Employee(101,8000,"Saloni",15,5,2001);
	emp[1]=new SalesManager(1000,3,102,5000,"Abhay",1,1,2001);
	emp[2]=new Programmer("Educatree ",2,3,103,9000,"Surabhi",2,2,2002);
	emp[3]=new Administrator(5,104,90000,"Ujjwal",9,9,2009);
	/*for(int i=0;i<emp.length;i++) {
		System.out.println(emp[i].toString());
	}
	for(int i=0;i<emp.length;i++) {
	//class cast exception
		System.out.println(((SalesManager) emp[i]).getSalesTarget());
		
	}*/
	for(Employee e:emp) {
		System.out.println(e.toString());
		//System.out.println(((SalesManager) e).getSalesTarget());// class cast exception
		if(e instanceof SalesManager) {
			double s=((SalesManager)(e)).getSalesTarget();
			System.out.println(s);
		}
		if(e instanceof Programmer) {
			String s=((Programmer)(e)).getProjectTitle();
			System.out.println(s);
		}
		if(e instanceof Administrator) {
			double s=((Administrator)(e)).getAllowance();
			System.out.println(s);
		}
	}
}
}
