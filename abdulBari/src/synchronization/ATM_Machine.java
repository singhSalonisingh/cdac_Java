package synchronization;

public class ATM_Machine {


	synchronized public void checkBalance(String name) {
		System.out.println("checking "+name);
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			e.getStackTrace();		}
	}
	synchronized public void withDraw(String name ,double amount) {
		System.out.println("name of coustomer "+name);
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			e.getStackTrace();
	}
		System.out.println("amount is "+amount);
}
}