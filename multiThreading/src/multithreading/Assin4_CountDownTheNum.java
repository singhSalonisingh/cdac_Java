package multithreading;

public class Assin4_CountDownTheNum implements Runnable{
	private Thread t;
	 int num;
	String name;
	public Assin4_CountDownTheNum() {
		t=new Thread(this);
	}
	public Assin4_CountDownTheNum(int num,String name) {
		t=new Thread(this);
		this.num=num;
		this.name=name;
	}
	public void run() {
		while(num>0) {
			System.out.println(name+" count is: "+num);
			num--;
		}
	}
	
	public Thread getThread() {
		return t;
	}
	
	public static void main(String[] args) {
		Assin4_CountDownTheNum a=new Assin4_CountDownTheNum(500,"first");
		Assin4_CountDownTheNum a1=new Assin4_CountDownTheNum(800,"second");
		Assin4_CountDownTheNum a2=new Assin4_CountDownTheNum(600,"third");
		System.out.println("count begin.......");
		a.getThread().start();
		a1.getThread().start();
		a2.getThread().start();
		try {
		a.getThread().join();
		a1.getThread().join();
		a2.getThread().join();
		}
		catch(InterruptedException e) {
			e.getStackTrace();
		}
		System.out.println("counting end...............");
	}
}
