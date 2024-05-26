package lmbdanestedClass;

public class lambdaClass {
	public static void main(String[] args) {
		myInterface m1=(n)->{
			if(n>0)
				return true;
			else
				return false;
		};
		System.out.println(m1.check(-8));
	}
}
