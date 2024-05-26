package streamandFileio;

import java.io.BufferedReader;
import java.io.FileReader;

public class Assin6_SerialNum {
public static void main(String[] args)throws Exception {
	BufferedReader br=new BufferedReader(new FileReader("D:\\myfiles\\data.txt"));
	String line;
	int count=1;
	while((line=br.readLine())!=null) {
		System.out.println((count++)+"."+line);
	}
	br.close();
}
}
