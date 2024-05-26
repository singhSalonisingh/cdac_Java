package model;

import interfEmp.Administrator;
import interfEmp.Employee;
import interfEmp.Programmer;
//import PolyEmp.Administrator;
//import PolyEmp.Employee;
//import PolyEmp.Programmer;
import interfEmp.SalesManager;

public class DemoEmpInterf {
	public static void main(String[] args) {
		//SalesManager s1=new SalesManager(1000,3,102,5000,"Abhay",1,1,2001);
		//System.out.println(s1);
		//Employee e1=new Employee(101,40000,"NAAAH",5,5,2004);
		//System.out.println(e1);
		
		Employee emp[]=new Employee[4];
		emp[0]=new Employee(101,8000,"Saloni",15,5,3001);
		emp[1]=new SalesManager(1000,3,102,5000,"Abhay",1,1,8801);
		emp[2]=new Programmer("Educatree ",2,3,103,9000,"Surabhi",2,2,7002);
		emp[3]=new Administrator(5,104,90000,"Ujjwal",9,9,2009);
		
		for(Employee e:emp) {
			System.out.println(e.toString());
			//System.out.println(((SalesManager) e).getSalesTarget());// class cast exception
			if(e instanceof SalesManager) {
				String s=((SalesManager)(e)).getPassportDetails();
				System.out.println(s);
			}
			if(e instanceof SalesManager) {
				int s=((SalesManager)(e)).TravelHours() ;
				System.out.println(s);
			}
			if(e instanceof SalesManager) {
				double s=((SalesManager)(e)).getSalesTarget();
				System.out.println(s);
			}
	}
	
	
	}}
