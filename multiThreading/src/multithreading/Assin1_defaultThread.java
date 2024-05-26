package multithreading;
public class Assin1_defaultThread extends Thread {
	public void run()
	{
		System.out.println(" this is  MultiThreading ");
	}
	public static void main(String[] args) {
		Thread t=new Assin1_defaultThread();
		t.start();
		System.out.println("process name :"+t.getName());
		System.out.println("priority name is :"+t.getPriority());
}
}