package assin3_Customer;

import java.io.Serializable;

public class Coustomer implements Serializable {
String name;
String emailid;
long phoneno;
public Coustomer() {
	name = " ";
	emailid = "";
	phoneno = 0;
}
public Coustomer(String name, String emailid, long phoneno) {
	this.name = name;
	this.emailid = emailid;
	this.phoneno = phoneno;
}

public String toString() {
	return "Coustomer [name=" + name + ", emailid=" + emailid + ", phoneno=" + phoneno + "]";
}



}
