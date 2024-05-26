package serializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AssinA10write_serial {
public static void main(String[] args) throws Exception{
	System.out.println("start");
	Employee[] ele= {new SalesManager("Saloni",101,4,8),
			new Programmer("Singh",102,"Online Mobile Recharge"),
			new Employee("Sloniiiiii",103)
			};
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\myfiles\\data9.txt"));
	
	for(Employee e : ele)
		oos.writeObject(e);
	
	oos.close();		
	
	System.out.println("emps saved");
	}
}

