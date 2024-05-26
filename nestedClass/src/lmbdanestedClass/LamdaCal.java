package lmbdanestedClass;

public class LamdaCal {
public static void main(String[] args) {
	emiCalculator e1=(p,r,n)->{
		return (p*r*n)/100;
	};
	System.out.println(e1.getEmiAmount(1000, 2, 3));
}
}
