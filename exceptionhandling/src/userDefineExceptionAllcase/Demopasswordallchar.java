package userDefineExceptionAllcase;

import java.util.Scanner;

public class Demopasswordallchar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter password: ");
	String pwd=sc.next() ;
	try {
	if(check(pwd))
		System.out.println("password loggin succefully");
	}
	catch(InvalidPwdException e) {
		System.out.println(e.getMessage());
	}
}
public static boolean check(String pwd) throws InvalidPwdException{
	
	boolean numflag=false,capitalflag=false,specialflag=false,flag=false;
	for(int i=0;i<pwd.length();i++) {
		char ch=pwd.charAt(i);
		if(ch>='A'&&ch<='Z')
			capitalflag=true;
		if(ch>=48&&ch<=57)
		numflag=true;
		if(!((ch>='A'&&ch<='Z')||(ch>=48&&ch<=57)||(ch>='a'&&ch<='z')))
		specialflag=true;
	}
	if(numflag&&capitalflag&&specialflag)
		flag =true;
	else 
		{
		throw new InvalidPwdException() ;
		}
	return flag;
}
}

