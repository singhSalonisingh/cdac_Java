package fundamentalsofOOP;

import java.util.Scanner;

public class Assin4_cordinates {
private int x,y;
public Assin4_cordinates(int x,int y) {
	this.x=x;
	this.y=y;
}
public void display() {
	System.out.println("["+x+","+y+"]");
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	Assin4_cordinates a=new Assin4_cordinates(10, 20);
	Assin4_cordinates a1=new Assin4_cordinates(x, y);
	a.display();
	a1.display();
}
}
