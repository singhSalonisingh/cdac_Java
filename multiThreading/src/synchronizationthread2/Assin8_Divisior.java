package synchronizationthread2;

public class Assin8_Divisior implements Runnable {

	private Thread t;
	int num;
	String name;
	public Assin8_Divisior() {
		t=new Thread(this);
	}

	public Assin8_Divisior(String name,int num) {
		t=new Thread(this);
		this.name=name;
		this.num=num;
	}
	synchronized public void run() {
		  {	for(int i=1;i<=num;i++) {
		if(num%i==0)
			System.out.println(name+" "+i);
		}
	}}
	public Thread getT() {
		return t;
	}
	
	public static void main(String[] args) {
		Assin8_Divisior a1=new Assin8_Divisior("for 32:",32);
		Assin8_Divisior a2=new Assin8_Divisior("     for 12:",12);
		Assin8_Divisior a3=new Assin8_Divisior("           for 24:",24);
		a1.getT().start();
		a2.getT().start();
		a3.getT().start();
		System.out.println("****************");
	}
}
