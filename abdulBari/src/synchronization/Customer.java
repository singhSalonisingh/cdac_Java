package synchronization;

public class Customer extends Thread{
ATM_Machine atm; 
String name;
double amount;

public Customer(double amount, ATM_Machine a,String name) {
	
	this.amount=amount;
	atm =a;
	this.name=name;
}
public void useATM() {
	atm.checkBalance(name);
	 atm.withDraw(name,amount);
}
public void run() {
	useATM();
}
public static void main(String[] args) {
	ATM_Machine atm=new ATM_Machine();
	Customer c1=new Customer(100,atm,"Saloni");
	Customer c2=new Customer(100,atm,"Saloniiiiii");
	Customer c3=new Customer(100,atm,"Saloniiiiiiiiiiiiiii");
	
	c1.start();
	c2.start();
	c3.start();
	System.out.println("@@@@@");
	
	
}
}

