package logical;

import java.util.Scanner;

public class GreatestAmongThree {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your three numbers here:   ");
	int number1=sc.nextInt();
	int number2=sc.nextInt();
	int number3=sc.nextInt();
	if (number1>number2 && number1>number3 )
		System.out.println("number1 is greater "+number1);
	else if(number2>number1 && number2>number3)
		System.out.println("number2 is greater "+number2);
	else
		System.out.println("number3 is greater "+number3);
}
}
