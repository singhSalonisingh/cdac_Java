package nameformatexception;

import java.util.Scanner;

public class DemoNameSpecifier {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String firstName =sc.next();
		System.out.println("Enter Last Name: ");
		String lastName=sc.next();
		try {
    //  if((firstName.charAt(0)>='A'&&firstName.charAt(0)<='Z') && (lastName.charAt(0)>='A' && lastName.charAt(0)<='Z'))
			if(firstName.matches("[A-Z][a-z]*")&&lastName.matches("[A-Z][a-z]*"))
    	  System.out.println("Welcome < "+firstName+" > < "+lastName+" >");
      else
      throw new CharacterFormatException();
		}
		catch(CharacterFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
