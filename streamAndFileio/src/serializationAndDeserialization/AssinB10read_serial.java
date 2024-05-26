package serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AssinB10read_serial {
public static void main(String[] args) throws Exception {
	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\myfiles\\data9.txt"));
	Employee [] ele= new Employee[3];
	for(int i=0;i<ele.length;i++) {
		/*
		 
		 // this one is another way of reading object  
		Object obj=ois.readObject();
		
		//this one is another way of typecasting
		 
		if(obj instanceof Employee) {
			Employee e=(Employee)obj;
			ele[i]=e;
		}*/
		
		
		ele[i] = (Employee)ois.readObject();
	}	
	ois.close();
	for(Employee e :ele)
		System.out.println(e);

	System.out.println("**********************************");
}
}
