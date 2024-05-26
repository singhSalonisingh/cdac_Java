package multithreading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assin5_CopyReadWriteThread implements Runnable {
private Thread t;
String source ;
String Destination;
public Assin5_CopyReadWriteThread() {
	t=new Thread(this);
	
}


public Assin5_CopyReadWriteThread(String source, String destination) {
	t=new Thread(this);
	this.source = source;
	Destination = destination;
}


public void run() {
	BufferedReader br=null;
	BufferedWriter bw=null;
	try {
	br=new BufferedReader(new FileReader( "D:\\myfiles\\data.txt"));//read from this
	 bw=new BufferedWriter(new FileWriter("D:\\myfiles2\\data12.txt"));//write in this
	int n;//n =br is object which is assigning to n
	while((n=br.read())!=-1) {
		bw.write((char)n);
		
	}
	}
	catch(IOException e) {
		e.getStackTrace();
	}
	System.out.println("file copied...");
	try {
	br.close();
	bw.close();
	}
	catch(IOException e) {
		e.getStackTrace();
	}
}
public Thread getThread() {
	return t;
}

public static void main(String[] args) {
	Assin5_CopyReadWriteThread a1=new Assin5_CopyReadWriteThread("D:\\myfiles\\data.txt","D:\\myfiles2\\data12.txt");
	System.out.println("main.......");
	a1.getThread().start();
}
}
