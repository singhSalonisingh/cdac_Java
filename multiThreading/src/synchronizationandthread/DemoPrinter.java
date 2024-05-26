package synchronizationandthread;

public class DemoPrinter {
public static void main(String[] args) {
	Assin7_Printer p= new Assin7_Printer();
	PrinterJob p1=new PrinterJob(p,"(","header",")");
	PrinterJob p2=new PrinterJob(p,"{","body","}");
	PrinterJob p3=new PrinterJob(p,"[","footer","]");
	
	p1.getThread().start();
	p2.getThread().start();
	p3.getThread().start();
}
}
