package assin10_producerConsumer;

public class Stock {
int qtyProducer ;
int qtyConsumer;
boolean bProduced;

public synchronized void Produce() {
	if(bProduced) {
		try {
		wait();
		}catch(InterruptedException e) {
			e.getStackTrace();
		}
	}
	qtyProducer++;
	System.out.println("produced "+qtyProducer);
	bProduced=true;
	notify();
}

public synchronized void Consume() {
	if(!bProduced) {
		try {
		wait();
		}catch(InterruptedException e) {
			e.getStackTrace();
		}
	}
	qtyConsumer++;
	System.out.println("consumed "+qtyConsumer);
	bProduced=false;
	notify();
}
}
