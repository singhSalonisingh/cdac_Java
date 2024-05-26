package countryexception;

public class InvalidCountryException extends Exception{
	String msg;
public InvalidCountryException() {
	msg="User Outside India cannot be Registered: ";
}
public String getMessage() {
	return msg;
}
}
