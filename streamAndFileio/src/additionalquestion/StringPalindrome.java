package additionalquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPalindrome {
public static void main(String[] args) {
	BufferedReader br=null;
	//int mod;
	//String rev=null;
	try {
	br=new BufferedReader(new InputStreamReader(System.in));
	String n;
	String rev="";
	System.out.println("enter ");
	n=br.readLine();
	//n=n.reverse();
		for(int i=0;i<n.length();i++) {
			char ch=n.charAt(i);
		//	rev=rev+ch;
			System.out.println(rev);
		}
		if(rev==n)
			System.out.println("string is palindrome ");
		else
			System.out.println("not palindrome ");
	
	}
	catch(IOException e) {
		e.getStackTrace();
	}
}
}
