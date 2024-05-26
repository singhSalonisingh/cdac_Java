package synchronizationandthread;

public class Assin7_Printer {
public synchronized void print(String header,String body,String footer) {
		
		/*synchronized (this) {   //lock acquired//we can write this or that
			try{
				System.out.println(header);
				Thread.sleep(500);
				System.out.println(body);
				Thread.sleep(500);
				System.out.println(footer);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}  //lock released
		}*/
		
		try{
			System.out.println(header);
			Thread.sleep(500);
			System.out.println(body);
			Thread.sleep(500);
			System.out.println(footer);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}  //lock released
	}
}
