package userDefineExceptionAllcase;

public class InvalidPwdException extends Exception{
String msg;
public InvalidPwdException() {
	msg="Password Should be One numeric, one uppercase,one lowercase and one specialcase";
}
public String getMessage() {
	return msg;
}

}
