package logical;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your number here:   ");
	int number=sc.nextInt();
	boolean flag=true;
	for(int i=2;i<number/2;i++) {
		if(number%i==0) 
		flag=false;
	}
	if(number!=1&&flag==true)
	System.out.println(number+" is prime");
	else
		System.out.println(number+" not prime");
}
}
