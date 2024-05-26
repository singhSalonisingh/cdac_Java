package assin10_producerConsumer;

public class ThreadCommDemo {
	public static void main(String[] args) {
		Stock s = new Stock();
		//newly created
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);		
		
		//runnable
		p.getT().start();
		c.getT().start();		
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		/*
		p.getT().stop();
		c.getT().stop();
		*/
		
		p.stopNow(); //bRun=false-loop terminated
		c.stopNow();
		
		try {
			p.getT().join();
			c.getT().join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total qty produced : "+s.qtyProducer);
		System.out.println("Total qty consumed : "+s.qtyConsumer);

	}

}
