package prime;

public class prime_num {
public static void main(String[] args) {

	for(int i=11;i<99;i++) {
		boolean flag=true;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				flag=false;
				break;
			}
			
		}
		if(flag==true && i!=1) {
			System.out.println(i+"  is  prime");
		}
	}
}
}
