package assin3_Customer;

public class RegisteredCoustomer extends Coustomer{
int regno;



public RegisteredCoustomer() {
	super();
}
public RegisteredCoustomer(String name,String emailid,Long phoneno,int regno) {
	super(name,emailid,phoneno);
	this.regno = regno;
}

public String toString() {
	return "Customer detail" + super.toString()+"  " +regno;
			
}




}
