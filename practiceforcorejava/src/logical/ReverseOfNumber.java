package logical;

import java.util.Scanner;

public class ReverseOfNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number: ");
	int num=sc.nextInt();
	int mod;
	int rev=0;
	while(num>0) {
		mod=num%10;
		num=num/10;
		rev=(rev*10)+mod;
	}
	System.out.println("reverse is : "+rev);
}
}
