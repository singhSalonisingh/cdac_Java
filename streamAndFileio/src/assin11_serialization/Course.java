package assin11_serialization;

import java.io.Serializable;

public class Course implements Serializable{

	private int courseId;
	private String courseName;
	private double fees;
	
	public Course() {
		
	}

	public Course(int courseId, String courseName, double fees) {
		//super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", fees=" + fees + "]";
	}
	

}
