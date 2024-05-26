package streamandFileio;

import java.io.BufferedReader;
import java.io.FileReader;

public class Assin8_maxLineCharNum {
public static void main(String[] args)throws Exception {
	BufferedReader br=new BufferedReader(new FileReader("D:\\myfiles\\data.txt"));
	String line;
	int count=1;
	int countS=0;
	int count1=1;
	int max=0;
	String maxline=null;
	
	int maxl=1;
	
	line=maxline;
	while((line=br.readLine())!=null) {
		countS++;
		System.out.println((count++)+"."+line);
		if(line.length()>max) {
			max=line.length();
			maxline=line;
			maxl=countS;
	}
	}
	for(int i=0;i<maxline.length();i++) {
		char ch=maxline.charAt(i);
		count1++;
	}
	System.out.println("maximum line is : "+maxline);
	System.out.println("number of characters of maxline are: "+count1);
	System.out.println("max line number is "+maxl);
	br.close();
}
}
