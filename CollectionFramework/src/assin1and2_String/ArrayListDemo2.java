package assin1and2_String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListDemo2 {
public static void main(String[] args) {
	List <String> list2=new ArrayList<>();//here ArrayList is concrete class, and List is interface
	Scanner sc =new Scanner(System.in);
	System.out.println("accepting string untill user enters stop");
	String str="";
	while(!((str=sc.next()).equals("stop"))){
		list2.add(str);
	}
	System.out.println(list2);
	list2.remove(2);//remove index at 2
	System.out.println(list2);
	System.out.println("Size of String is..."+list2.size());
	
	//display using for each loop//advance loop
	System.out.println("display using advance loop(for each loop).......");
	for(String s:list2) {
		System.out.println(s);
	}
	
	//display using iterator
	System.out.println("display using iterator.......");
	Iterator<String> i=list2.iterator();
	while(i.hasNext())
		System.out.println(i.next());
	
	//display last to first....
	System.out.println("display elements last to first.....");
	ListIterator<String> st=list2.listIterator();
	while(st.hasNext()) {
		String s=st.next();
		//System.out.println(st);
	}
	while(st.hasPrevious())
		System.out.println(st.previous());
	
	//sorting the list...
	System.out.println("sorting the list*******************");
	Collections.sort(list2);
	System.out.println(list2);
	
	//display list in reverse order........
	System.out.println("display list in reverse order****************");
	Collections.reverse(list2);
	System.out.println(list2);
	
	//search elements...........
	System.out.println("searching elements*******************");
	String name=sc.next();
	int index=Collections.binarySearch(list2, name);
	System.out.println(index);
	
}
}
