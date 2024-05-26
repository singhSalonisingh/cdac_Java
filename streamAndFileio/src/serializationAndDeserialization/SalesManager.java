package serializationAndDeserialization;

import java.io.Serializable;

public class SalesManager extends Employee  {
private double salesTarget;
private double perCommission;
public SalesManager() {
	
}

public SalesManager(String name,int eid,double salesTarget,double perCommission) {
	super(name,eid);
	this.salesTarget=salesTarget;
	this.perCommission=perCommission;
}

public String toString() {
	return "SalesManager :: "+super.toString()+"salesTarget=" + salesTarget + ", perCommission=" + perCommission ;
}


}

