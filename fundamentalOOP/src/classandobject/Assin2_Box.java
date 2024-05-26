package classandobject;

import java.util.Scanner;

public class Assin2_Box {
	private int height,width,depth;

	public Assin2_Box(int height ,int width,int depth){
	this.height=height;
	this.width=width;
	this.depth=depth;
	}

	public void display() {
		System.out.println("h= "+height+"w= "+width+"d= "+depth);
	}
	public int Volume(){
return height*width*depth;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Assin2_Box[] a=new Assin2_Box[2];
	int h,w,d;
	for(int i=0;i<a.length;i++) {
		System.out.println("h ");
		h=sc.nextInt();
		System.out.println("w ");
		w=sc.nextInt();
		System.out.println("d ");
		d=sc.nextInt();
		a[i]=new Assin2_Box(h, w, d);
		a[i].display();
		
	}
	for(int i=0;i<a.length;i++) {
		System.out.println("volume is "+a[i].Volume());
	
	}
	}
	}

