package assin10_producerConsumer;

public class Consumer implements Runnable {
	private Thread t;
	Stock s;
	boolean bRun;
	
	public Consumer(Stock s) {
		t = new Thread(this);
		this.s = s;
		bRun = true;
	}

	@Override
	public void run() {
		while(bRun)
			s.Consume();
	}
	
	public Thread getT() {
		return t;
	}
	
	public void stopNow() {
		bRun = false;
	}

}
