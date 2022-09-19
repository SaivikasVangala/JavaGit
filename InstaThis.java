
class Theme {
	int MobileNo;
	String password;

	Theme(int MobileNo, String password) {
		this.MobileNo = MobileNo;
		this.password = password;
	}

	void login() {
		System.out.println("MobileNo =" + MobileNo + " password= " + password);
		System.out.println("You are succesfully logged in");
	}

	void uploadStory() {
		this.login();
		System.out.println("Select a file from the internal folder");
		System.out.println("Story uploaded succesfully");
	}
}
public class InstaThis {
	public static void main(String[] args) {
		Theme T = new Theme(9874521, "vikas");
		T.uploadStory();
	}

}
