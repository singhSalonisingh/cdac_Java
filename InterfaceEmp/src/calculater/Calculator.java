package calculater;

public class Calculator implements iCalculator{
	private int a,b;
public Calculator(int a,int b) {
	this.a=a;
	this.b=b;
}
	public double add(int a,int b) {
		return a+b;
	} 
	public double sub(int a,int b) {
		return a-b;
	}
	public double mul(int a,int b) {
		return a*b;
	}
	public double div(int a,int b) {
		return a/b;
	}
public static void main(String[] args) {
	Calculator c=new Calculator(12,2);
	System.out.println(c.add(12,2));

}
}
