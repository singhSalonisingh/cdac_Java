package multithreading;

public class Assin2B_Runnable implements Runnable {

	public void run() {
		for(int i=1;i<=5;i++) 
			System.out.println("child thread "+i);
	try {
		Thread.sleep(500);
	}
	catch(InterruptedException e) {
		e.getStackTrace();
	}
	}
	public static void main(String [] arg) {
		Assin2B_Runnable n=new Assin2B_Runnable();
		Thread t=new Thread(n);
		t.start();
		for(int i=1;i<=5;i++) 
			System.out.println("main thread "+i);
	try {
		Thread.sleep(500);
	}
	catch(InterruptedException e) {
		e.getStackTrace();
	}
	}
}
