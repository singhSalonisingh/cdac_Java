package streamandFileio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assin1_q {
public static void main(String[] args) {
	BufferedReader br=null;
	int count=0;
	int count1=0;
	try {
	
	br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 'q' to quit ");
	int  n;
	while((n=br.read())!='q'){
		System.out.print((char)n);
		//br.close();//it will show exception after one word
		//count++;
		if((n>='A'&&n<='Z')||(n>='a'&&n<='z'))
			count++;
		if(n>=48&&n<=57)
			count1++;
			
	}
	System.out.println("for alphabets "+count);
	System.out.println("for integer "+count1);
	}
	catch(IOException e) {
		e.printStackTrace();
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
