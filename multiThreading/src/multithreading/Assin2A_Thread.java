package multithreading;
public class Assin2A_Thread extends Thread{
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
	Thread t=new Assin2A_Thread();
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