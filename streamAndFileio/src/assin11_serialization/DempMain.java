package assin11_serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DempMain {
public static void main(String[] args)throws Exception {
	Student[] s= {
			new Student("Saloni",188,"1829djjd9292",2001,"Dac",100000),
			new Student("Singh",18,"18jd9292",3001,"Dac",200000),
			new Student("Saloniiii",88,"18hhhh29djjd9292",3001,"Dac",400000)
	};
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\myfiles\\data7.txt"));
	for(Student st : s)
		oos.writeObject(st);
	
	oos.close();		
	
	System.out.println("student data saved");
}
}
