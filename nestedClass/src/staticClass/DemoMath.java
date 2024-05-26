package staticClass;

public class DemoMath {
	public static void main(String[] args) {
		Math obj =new Math();
		Math.Calculator obj1=new Math.Calculator();
		obj1.Addition(10, 5);
		obj1.Substraction(10, 2);
		obj1.Multiplication(10, 2);
		obj1.Division(10, 2);
	}
}
