package logical;

import java.util.Scanner;

public class SumwithoutTemp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("write two number: ");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	System.out.println("num1: "+num1+"  "+"num2: "+num2);
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	System.out.println("num1: "+num1+"  "+"num2: "+num2);
}
}
