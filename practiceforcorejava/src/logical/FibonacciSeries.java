package logical;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	int n=sc.nextInt();
	int a1=0;
	int a2=1;
	int a3;
	for(int i=0;i<=n;i++) {
	a3=a1+a2;
	System.out.println(a1);
	a1=a2;
	a2=a3;
	}
	
	
	
}
}
