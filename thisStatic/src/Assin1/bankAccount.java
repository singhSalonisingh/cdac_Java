package Assin1;

public class bankAccount {
	private static float interest_rate;
private int accno;
private float balance;
public bankAccount() {
	accno=0;
	balance=0;
}
public bankAccount(int a,float b) {
	accno=a;
	balance=b;
}
static {
	interest_rate=7.25f;//older interestrate
}
public void display() {
	System.out.println("account number is: "+accno+"balance is :"+balance+"balance with current rate of interest= "+(balance+(balance*interest_rate/100)));
}

public static void updateInterestRate(float newRateOfInterest) {

	interest_rate=newRateOfInterest;
	//interest_rate= newRateOfInterest;
}
/*public void display1() {
	System.out.println("account number is: "+accno+"balance is :"+balance+"balance with current rate of interest= "+(balance*updateInterestRate()/100);
}*/

}
