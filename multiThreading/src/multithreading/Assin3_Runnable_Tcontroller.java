package multithreading;

public class Assin3_Runnable_Tcontroller implements Runnable{//implements runnable
	
	private Thread t;//declaring thread instance
	public Assin3_Runnable_Tcontroller() {//make contructor and pass
		t=new Thread(this);
	}
	
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
	public Thread getThread() {
		return t;
	}
	
	public static void main(String [] arg) {
		Assin3_Runnable_Tcontroller n=new Assin3_Runnable_Tcontroller();
		n.getThread().start();//task controller or thread controller
	//	n.getThread().start();//it will show exception
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
