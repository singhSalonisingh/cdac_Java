package userDefineexceptionpassword;

import java.util.Scanner;

public class DemopasswordException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String password=args[0];
		System.out.println("enter password: ");
		String password=sc.next();
		try {
				if(password.length()>12 )
					throw new PasswordExceptionforLong();
				if(password.length()<8)
					throw new PasswordExceptionforShort();
			
		}
		catch(PasswordExceptionforLong e) {
			System.out.println(e.getMessage());
		}
		catch(PasswordExceptionforShort e) {
			System.out.println(e.getMessage());
		}
	}

}
