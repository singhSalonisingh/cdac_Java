package streamandFileio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assin2_quit {
public static void main(String[] args) {
	BufferedReader br=null;
	int count=0;
	try {
	br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 'quit' to quit ");
	String line;
	int max=0;
	String maxline=null;
	line=maxline;
	while(!((line=br.readLine()).equals("quit"))) {
		//System.out.println(line);
		if(line.length()>max) {
			max=line.length();
			maxline=line;
	}
	}
	System.out.println(maxline);
	for(int i=0;i<maxline.length();i++) {
		char ch=maxline.charAt(i);
		count++;
	}
	System.out.println("count is: "+count);
	}
	catch(IOException e) {
		e.getStackTrace();
	}
	finally {
		try {
			br.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
}
