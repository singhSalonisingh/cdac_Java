package serializationAndDeserialization;

import java.io.Serializable;

public class Programmer extends Employee  {
private String projectTitle;
public Programmer() {
	
}
public Programmer(String name,int eid,String projectTitle) {
	super(name,eid);
	this.projectTitle=projectTitle;
}

public String toString() {
	return "Programmer :: "+super.toString()+"projectTitle=" + projectTitle ;
}


}
