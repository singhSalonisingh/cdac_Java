package streamandFileio;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assin4_writeRead {
public static void main(String[] args) throws Exception{
	BufferedReader br=null;
	FileOutputStream fos =null;
	//
	FileReader fr=null;
	br=new BufferedReader(new InputStreamReader(System.in));
	fos = new FileOutputStream("D:\\myfiles\\data.txt");
	//
	fr=new FileReader("D:\\myfiles\\data.txt");
	System.out.println("Enter 'quit' to Quit ");
	//
	int n;
	String line;
	while(!(line=br.readLine()).equals("quit")) {
		fos.write(line.getBytes());
		fos.write("\n".getBytes());
	}
	while((n=fr.read())!=-1) {
		System.out.println((char)n);
	}
	
		br.close();
		fr.close();
}
}
