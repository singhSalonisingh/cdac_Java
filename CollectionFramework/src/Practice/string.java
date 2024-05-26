package Practice;

import java.util.ArrayList;
import java.util.List;

public class string {
public static List<String> addElement(String [] str){
	List<String> list=new ArrayList<>();
	
	for(String s:str) {
		list.add(s);
		//System.out.println(s);
	}
	return list;
}
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	System.out.println("*********");
	String st[]= {"kk","uu"};
	list=addElement(st);
	//list.add("yy");
	System.out.println(list);
	System.out.println(list.size());
}
}
