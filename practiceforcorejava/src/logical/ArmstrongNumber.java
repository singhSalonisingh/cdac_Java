package logical;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter any number: ");
	int n=sc.nextInt();
	int rem,mul=0;
	int digit=n;
	while(n>0) {
		rem=n%10;
		n=n/10;
		mul=(rem*rem*rem)+mul;
	}
	System.out.println(mul);
	System.out.println("original number is "+digit);
	if(mul==digit)
		System.out.println("armstrong");
	else
		System.out.println("not armstrong");
}
}
