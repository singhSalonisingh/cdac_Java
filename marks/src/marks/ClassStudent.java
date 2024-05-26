package marks;
import java.util.*;
public class ClassStudent {
public static void main(String arg[]) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter number of student: ");
	int numberOfStudent = sc.nextInt();
	Student[] students  = new Student[numberOfStudent]; // initialized array which can store object of Student class
	
	for(int j=0;j<numberOfStudent;j++) {
		System.out.println("Enter details of student: " + (j+1));
		System.out.println("Enter roll no: ");
		int rno=sc.nextInt();
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter subno: ");
		int subno=sc.nextInt();
		int[] marks=new int[subno]; //define + initialization new int[2]
		for(int i=0;i<subno;i++) {
			System.out.println("Enter marks of subject: " + (i+1));
			int temp = sc.nextInt();
			marks[i]=temp; // saving value in the array
		}
		Student s =new Student(rno,subno,name,marks); // object of Student
		students[j] = s;
	}
	
	for(int j=0;j<numberOfStudent;j++) {
		Student obj = students[j];
		obj.display();
	}
	
}
}
