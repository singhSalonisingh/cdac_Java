package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class integer {
public static List<Integer> addElement(int [] arg){
	List<Integer> list=new ArrayList<>();
	for(Integer i:arg) {
		System.out.println(i);
	}
	return list;
}
public static void main(String[] args) {
	List <Integer> l1=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string untill stop...");
	int [] j= {7,7,8};
    addElement(j);
	l1.add(88);
	//l1.addElement();
	System.out.println(l1);
}
}
