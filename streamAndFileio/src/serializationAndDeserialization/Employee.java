package serializationAndDeserialization;

import java.io.Serializable;

public class Employee implements Serializable {
private String name;
private int eid;

public Employee(){
	
}

public Employee(String name,int eid)
{	
this.name=name;
this.eid=eid;
}
public String toString() {
	return  " Employee name : "+name+" Employee id: "+eid;	
}
}
