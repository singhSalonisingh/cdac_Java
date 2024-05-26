package model;

import utility.Employee;
import sports.CricketPlayer;
import sports.FootBallPlayer;
import sports.Player;
import staff.Administrator;
import staff.Programmer;
import staff.SalesManager;
import utility.Date;
import utility.Person;
public class DemEmp {
public static void main(String arg[]) {
	
	Employee e1=new Employee();
	System.out.println(e1.display());

	Employee e2=new Employee(101,90000,"Saloni",15,06,2001);
	System.out.println(e2.display());
	
	SalesManager s1=new SalesManager();
	System.out.println(s1.display());
	
	//double salesTarget,double perCommission,int eid,double basicSalary,String name,int day,int month,int year
	SalesManager s2=new SalesManager(90111,2,102,80000,"Singh",06,05,2024);
	System.out.println(s2.display());
	
	Programmer p1 =new Programmer();
	System.out.println(p1.display());
	
	//String projectTitle,int extraHours,double chargesPerExtraHour,int eid,double basicSalary,String name,int day,int month,int year
	Programmer p2=new Programmer(" Online Mobile Recharge ",4,1000,103,100000,"Surabhi",07,04,2024);
	System.out.println(p2.display());
	
	Administrator a1=new Administrator();
	System.out.println(a1.display());
	
	Administrator a2=new Administrator(50,504,50000,"Sal",25,05,2025);
	System.out.println(a2.display());
	
	Player pl1=new Player();
	System.out.println(pl1.display());
	
	Player pl2=new Player(1001,700,"Ujjwal",13,9,1997);
	System.out.println(pl2.display());
	
	//CricketPlayer c1=new CricketPlayer();
	//System.out.println(c1);
	CricketPlayer c2=new CricketPlayer();
	System.out.println(c2.toString());
	
	CricketPlayer c3=new CricketPlayer(71,4,1,100,"Virat",07,3,2024);
	System.out.println(c3.toString());
	
	FootBallPlayer f1=new FootBallPlayer();
	System.out.println(f1.toString());
	//int totalGoalsScored, int playerId,double contractFees,String name,int day,int month,int year
	FootBallPlayer f2=new FootBallPlayer(6,2,800,"robin",4,8,489);
	System.out.println(f2.toString());
}
}
