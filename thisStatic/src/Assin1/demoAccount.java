package Assin1;
public class demoAccount {
	public static void main(String a[]) {
		
		bankAccount b1=new bankAccount(19283,9000);
		b1.display();
		bankAccount.updateInterestRate(8.7f);
		bankAccount b2=new bankAccount(19284756,9000);
		b2.display();
		
	}

}
