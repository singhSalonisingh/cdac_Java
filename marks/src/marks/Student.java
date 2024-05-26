package marks;

public class Student {
private int rollNumber,subjectNumber;
private String name;
private int[] marks; 

public Student() {
	rollNumber=0;
	subjectNumber=0;
	name="";
	marks=new int [subjectNumber]; //new int[0]; Array initialization with count of 0 element
}

public Student(int rollNumber,int subjectNumber,String name,int[] marks) {
	this.rollNumber=rollNumber;
	this.subjectNumber=subjectNumber;
	this.name=name;
	this.marks=marks;
}

public void display() {
	System.out.println("Roll Number : "+rollNumber+", Name : "+name+", Number of Subjects : "+subjectNumber);
	for(int i=0; i<marks.length; i++) {
		System.out.println("Subject Number: "+ (i+1) +", Marks: "+marks[i]);
	}
}
}
