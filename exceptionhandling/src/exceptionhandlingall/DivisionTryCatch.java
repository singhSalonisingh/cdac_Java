package exceptionhandlingall;

//import java.util.Scanner;

public class DivisionTryCatch {
public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	try {
	int num1=Integer.parseInt(args[0]);
	int num2=Integer.parseInt(args[1]);
	 double num =num1/num2;
	 System.out.println(num);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		e.getMessage();
	}
	catch(NumberFormatException e) {
		e.getStackTrace();
	}
	catch(ArithmeticException e) {
		e.getStackTrace();
	}
}
}
