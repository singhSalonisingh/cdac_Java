package assin1and2_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
public static void main(String[] args) {
	List <String> l1=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string untill stop...");
	String str="";
	/* str=sc.next();
		while(str!="no") {
			 l1.add(str);
		}*/
	while(!(str=sc.next()).equals("stop"))
		l1.add(str);
	System.out.println(l1);
	l1.remove(2);//remove index at 2
	System.out.println(l1);
	l1.remove("hh");
	System.out.println(l1);
}
}
