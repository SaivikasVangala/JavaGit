import java.util.Scanner;

class InstaApp {

	void upload(int NoOfPics, String picDescription) {
		System.out.println("NoOf pics uploaded are " + NoOfPics);
		System.out.println("Description for the pic is " + picDescription);
	}

	void upload(String Location, String tag) {
		System.out.println("Location for pics uploaded are " + Location);
		System.out.println(" Also People present in the pic is " + tag);
	}
}

public class InstaOverLoad {
	public static void main(String[] args) {
		InstaApp i = new InstaApp();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter details for 1st method");
		i.upload(s.nextInt(), s.next());
		System.out.println("Enter details for 2nd method");
		i.upload(s.next(), s.next());
	}

}
