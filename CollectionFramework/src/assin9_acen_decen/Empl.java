package assin9_acen_decen;

import java.util.Comparator;

public class Empl implements Comparator<Empl>{
	int empid;
	String name;
	float salary;
	int depid;
	public Empl() {
		empid = 0;
		name = "";
		salary =0.f;
		depid=0;
	}
	public Empl(int empid, String name, float salary,int depid) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.depid=depid;
	}
	@Override
	public String toString() {
		return "Empl [empid=" + empid + ", name=" + name + ", salary=" + salary + ", depid "+depid+ "]";
	}
	
	/*public int compare(Empl o1, Empl o2) {
		int diff=o1.depid-o2.depid;
		//int diff=0;
	if(diff==0) {
		if(o1.salary>o2.salary) {
		 diff=-1;
		}
		else if(o1.salary<o2.salary)
			diff=1;
		else if(o1.salary==o2.salary) {
		    diff=o1.name.compareTo(o2.name);//compareTo method is from String
				if(diff==0) 
				    diff=o1.depid-o2.depid;
				  else
				     diff=o1.empid-o2.empid;	
		}	
		}
		return diff;
	}*/
	
	public int compare(Empl o1,Empl o2) {
		int diff=0;
		diff=o1.depid-o2.depid;
		  if(diff==0) {
			  diff=(int) (o1.salary-o2.salary);
			  if(diff==0) {
				  diff=o1.name.compareTo(o2.name);
				      if(diff==0) {
				    	  diff=o1.empid-o2.empid;
				      }
			  }
		  }
		return diff;
	}
}
