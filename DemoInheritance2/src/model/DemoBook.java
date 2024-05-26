package model;

import library.Book;
import library.PaperBook;

public class DemoBook {
public static void main(String arg[]) {
	//manual
	/*Book b1=new Book();
	System.out.println(b1.toString());
	
	Book b2=new Book("Guliver's Travel",700,101);
	System.out.println(b2.toString());
	
	PaperBook p1 = new PaperBook();
	System.out.println(p1.toString());
	
	PaperBook p2 = new PaperBook(800,"Three Mistakes of My Life ",300,102,10,03,2001);
	System.out.println(p2.toString());*/
	
	Book b[];
	b=new Book[3];
	b[0] = new Book("Guliver's Travel",700,101);
	b[1] = new PaperBook();
	b[2] = new PaperBook(800,"Three Mistakes of My Life ",300,102,10,03,2001);
	for (int i=0; i<b.length;i++) {
		System.out.println(b[i]);
	}
}
}
