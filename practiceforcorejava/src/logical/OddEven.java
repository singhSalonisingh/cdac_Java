package logical;

import java.util.Scanner;

public class OddEven {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your number here:   ");
	int number=sc.nextInt();
	if(number%2==0) 
		System.out.println(number+" is an even number: ");
	else
		System.out.println(number+" is an odd number: ");
}
}
