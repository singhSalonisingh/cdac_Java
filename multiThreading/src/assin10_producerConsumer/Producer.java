package assin10_producerConsumer;

public class Producer implements Runnable{
private Thread t;
Stock s;
boolean bRun;
public Producer(Stock s) {
	t=new Thread(this);
	this.s=s;
	bRun= true;
}
	
public void run() {
	while(bRun)
		s.Produce();
}

public Thread getT() {
	return t;
}

public void stopNow() {
	bRun = false;
}

}
