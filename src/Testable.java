
public interface Testable {
	 static String giveMessage() {
		return "This is default message of an interface";
	}
	 default String getMes() {
		 return "new message";
	 }
	 
	 default String getMes1s() {
		 return "new message";
	 }

}
