package synchronizationandthread;

public class PrinterJob implements Runnable{
	    Assin7_Printer p;
	    String header,body,footer;
		private Thread t;
		
		public PrinterJob() {
			t = new Thread(this);
		}
		
		public PrinterJob(Assin7_Printer p, String header, String body, String footer) {
			super();
			this.p = p;
			this.header = header;
			this.body = body;
			this.footer = footer;
			t = new Thread(this);
		}

		public void run() {
			p.print(header, body, footer);
		}
		
		public Thread getThread() {
			return t;
		}
	}

