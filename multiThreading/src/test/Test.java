package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test implements Runnable{
private Thread t;
String source ;
//String Destination;
public Test() {
	t=new Thread(this);
}
public Test(String source) {
	t=new Thread(this);
	this.source = source;
	//Destination = destination;
}

public void run() {
	BufferedReader br=null;
	BufferedWriter bw=null;try {
	br=new BufferedReader(new FileReader( "D:\\KnowIt\\emails.txt"));
	// bw=new BufferedWriter(new FileWriter("D:\\KnowIt\\dataa13.txt"));
	// int n;
	 String line;
		while((line=br.readLine())!=null) {
			if(line.endsWith("gmail.com"))
			//bw.write(line);
			System.out.println(line);
		}
	}
	catch(IOException e) {
		e.getStackTrace();
	}
	System.out.println("file copied...");
	try {
	br.close();
	//bw.close();
	}
	catch(IOException e) {
		e.getStackTrace();
	}
}
public Thread getT() {
	return t;
}
public static void main(String[] args) {
	Test t=new Test("D:\\KnowIt\\emails.txt");
	t.getT().start();
	
}

}
