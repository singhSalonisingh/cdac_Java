package assin3_Customer;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DemoMain {
public static void main(String[] args) throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the number of elements int list");
	int num=Integer.parseInt(br.readLine());
	Coustomer [] all=new Coustomer[num];
	for(int i=0;i<num;i++) {
		System.out.println("enter name of the coustomer: ");
		String name=br.readLine();
		System.out.println("Enter email of coustomer: ");
		String email=br.readLine();
		System.out.println("Enter contact number: ");
		long phno=Long.parseLong(br.readLine());
		System.out.println("Enter reg number: ");
		int regno=Integer.parseInt(br.readLine());
		all[i]=new RegisteredCoustomer(name,email,phno,regno);
		all[i]=new Coustomer(name,email,phno);
	}
	
	
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:/Register.xls"));
	for(Coustomer c:all) {
		oos.writeObject(c);
	}
	oos.close();
	
	
	
	
	
	
	//reading to console............
	
	/*
	List<Coustomer> memb=new ArrayList<>();
	List<RegisteredCoustomer>rmemb=new ArrayList<>();
	
	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:/Register.xls"));
	while(true) {
		try {
			Object Obj=ois.readObject();
			if(Obj instanceof RegisteredCoustomer)
			rmemb.add((RegisteredCoustomer)Obj);
			else
				memb.add((Coustomer)Obj);
		}
		catch(Exception e) {
			break;
		}
		
	}
	
	System.out.println(memb.size());
	System.out.println(rmemb.size());
	System.out.println("List of coustomers...");
	for(Coustomer c: memb) {
		System.out.println(c);
	}
	
	System.out.println("list of registered coustomers: ");
	for(RegisteredCoustomer rc: rmemb)
		System.out.println(rc);
	ois.close();*/
}
}
