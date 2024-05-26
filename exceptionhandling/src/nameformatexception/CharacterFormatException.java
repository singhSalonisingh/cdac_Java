package nameformatexception;

public class CharacterFormatException extends Exception{
	String msg;
	public CharacterFormatException() {
		msg="First character of first name and last name should be in uppercase and other in lower case:  ";
	}
	public String getMessage() {
		return msg;
	}
}
