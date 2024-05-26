import DemoAssociation.Date;
import DemoAssociation.Person;

public class Test {
public static void main(String arg[]) {
	Date d1=new Date();
	System.out.println(d1.display());
	Date d2=new Date(05,04,2024);
	System.out.println(d2.display());
	Person p1=new Person();
	p1.display();
	Person p2=new Person("Saloni",5,4,2024);
	p2.display();
}
}
