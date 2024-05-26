package interfEmp;

public interface iTraveller {
 default public String getPasswportDetails() {
	 return "********";
 }
 default public int TravelHours() {
	 return 2;
 }
}
