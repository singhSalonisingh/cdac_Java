package staticClass;


public class Math{
	static int a,b;
	static class Calculator{
		public void Addition(int a,int b) {
			System.out.println("addition is: "+(a+b));
		}
		public void Substraction(int a,int b) {
			System.out.println("substraction is: "+(a-b));
		}
		public void Division(int a,int b) {
			System.out.println("Division is: "+(a/b));
		}
		public void Multiplication(int a,int b) {
			System.out.println("multiplication is: "+(a*b));
		}
	}
}


