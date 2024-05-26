package multithreading;

public class Assin6_PrimeThread implements Runnable{
	private Thread t;
	int start;
	int end;
	public Assin6_PrimeThread(int start,int end) {
		t=new Thread(this);
		this.start=start;
		this.end=end;
	}

	public void run() {
		
		for(int i=start;i<=end;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.println("prime number is: "+i);
			}	
	}
}
	public Thread getT() {
		return t;
	}

public static void main(String[] args) {
	Assin6_PrimeThread a1=new Assin6_PrimeThread(1,21);
	a1.getT().start();
	
	
	
	try {
	a1.getT().join();
	}
	catch(InterruptedException e) {
		e.getStackTrace();
	}
	System.out.println("main........");
}

}

/*public static void main(String[] args) {
for(int i=start;i<=end;i++) {
	boolean isPrime=true;
	for(int j=2;j<i;j++) {
		if(i%j==0) {
			isPrime=false;
			break;
		}
	}
	if(isPrime) {
		System.out.println(i);
	}
}*/
