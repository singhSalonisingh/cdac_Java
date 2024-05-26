package classandobject;

import java.util.Scanner;

public class Assin3_Student {
private int rno,subno;
private String name;
private int[] marks;
private static int k;
public Assin3_Student(String n,int r,int sb,int m[]) {
	rno=r;
	name=n;
	marks=m;
	subno=sb;
}
public void display() {
	System.out.println(" name= "+name+" rollnum = "+rno+" subno = "+subno);
	for(int i=0;i<subno;i++) {
		System.out.println(marks[i]);
	}
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int subno,rno;
	String name;
	
	System.out.println("enter subno: ");
	subno=sc.nextInt();
	Assin3_Student[] a=new Assin3_Student[subno];
	for(int i=0;i<a.length;i++) {
		System.out.println("enter your name: ");
		name=sc.next();
		System.out.println("enter rno: ");
		rno=sc.nextInt();
		System.out.println("enter your  marks of subject : ");
		int marks[]=new int[subno];
		for(int j=0;j<subno;j++) {
			marks[j]=sc.nextInt();
		}
		Assin3_Student s=new Assin3_Student(name, rno, subno, marks);
		s.display();
	}
}
}
