import java.util.Scanner;

class Insta {

	void selectApp() {
		System.out.println("Instagram app is opened");
	}

	void login(String UserName, String Password) {
		System.out.println("Username = " + UserName + " Password = " + Password);

	}

	String search() {
		return "SaiVikas Vangala";
	}

	String UploadPic(int NoOfPhotos, String filter) {
		System.out.println("No of photos =" + NoOfPhotos + " Filter = " + filter);
		return "Uploaded Successfully";
	}

}
public class InstaMethod {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Insta i = new Insta();
		i.selectApp();
		System.out.println("Enter login details");
		i.login(s.next(), s.next());
		System.out.println("Account searched for" + i.search());
		System.out.println("Enter no. of pics and filter");
		System.out.println("Photo " + i.UploadPic(s.nextInt(), s.next()));
	}

}
