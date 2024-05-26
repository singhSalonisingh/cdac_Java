package countryexception;

import java.util.Scanner;

public class DemoUserRegistration {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student's Name: ");
		String userName =sc.next();
		System.out.println("Enter Student's Country: ");
		String country=sc.next();
		registerUser(userName, country);
	}
	
	public static void registerUser(String userName,String country) {
		try {
			if (country.equalsIgnoreCase("India")) {
				System.out.println("User Registration Done Successfully: ");
			}
			if(!country.equalsIgnoreCase("India"))
			throw new InvalidCountryException();
			}
			catch (InvalidCountryException e) {
				System.out.println(e.getMessage());
			}
	}

}
