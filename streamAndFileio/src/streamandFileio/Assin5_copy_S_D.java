package streamandFileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Assin5_copy_S_D {
public static void main(String[] args)throws Exception {
	//BufferedReader br1=null;
	//br1=new BufferedReader(new InputStreamReader(System.in));
	BufferedReader br=null;
	br=new BufferedReader(new FileReader( "D:\\myfiles\\data.txt"));//read from this
	BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\myfiles2\\data1.txt"));//write in this
	int n;
	while((n=br.read())!=-1) {
		bw.write((char)n);
		
	}
	System.out.println("file copied...");
	br.close();
	bw.close();
}
}
