package userDefineexceptionpassword;

public class PasswordExceptionforShort extends Exception{
	String msg;
	public PasswordExceptionforShort() {
		msg="PasswordTooShortException";
	}
	public String getMessage() {
		return msg;
	}
}
