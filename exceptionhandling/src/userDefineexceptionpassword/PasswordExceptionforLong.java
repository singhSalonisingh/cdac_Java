package userDefineexceptionpassword;

public class PasswordExceptionforLong extends Exception{
String msg;
public PasswordExceptionforLong() {
	msg="PasswordTooLongException";
}
public String getMessage() {
	return msg;
}

}
