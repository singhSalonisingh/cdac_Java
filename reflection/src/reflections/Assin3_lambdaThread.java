package reflections;

public class Assin3_lambdaThread {
public static void main(String[] args) {
	
	iPrime p1=(num)->{
		for(int i=2; i<=1000;i++) {
			boolean pr=true;
			for(int j=2; j<i;j++) {
			if(i%j==0) {
				pr=false;
				break;
			}
			}
			if(pr) {
				System.out.println("prime number is:   "+i);
			}
		}
		return false;
	};
	System.out.println(p1.isPrime(9));
}
}
