package practice;

public class age {
public static void main(String[] args) {
	//int age=Integer.parseInt(args[0]);
	int age=0;
	try {
		if(age<18)
			throw new NumberFormatException("invalid age...");
		System.out.println("no exception***"+age);
	}
	catch(NumberFormatException e) {
		System.out.println("exception****");
		e.getStackTrace();
	}
	catch(Exception e) {
		System.out.println("parent exception*");
		e.getStackTrace();
	}
}
}
