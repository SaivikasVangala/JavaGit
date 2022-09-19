
class Login {
	String username, Password;
	long mobileNo;
}

class Profile {
	int followers;
	byte following;
	short NoOfPosts;
	String Page_you_recently_liked;
}

public class Instagram {

	public static void main(String[] args) {
		Login l = new Login();
		System.out.println("Enter your login details");
		l.username = "SaiVikas_Vangala";
		l.Password = "Vikas894";
		l.mobileNo = 849894726;
		System.out.println("username = " + l.username);
		System.out.println("Password = " + l.Password);
		System.out.println("mobileNo = " + l.mobileNo);
		System.out.println("You have succesfully logged in");

		Profile p = new Profile();
		System.out.println("-------------------");
		p.followers = 499;
		p.following = 99;
		p.NoOfPosts = 55;
		p.Page_you_recently_liked = "CAPDT";

		System.out.println("Your Account followers are " + p.followers);
		System.out.println("Your are following  " + p.following);
		System.out.println("No. of posts you uploaded are" + p.NoOfPosts);
		System.out.println("Your favourite page is " + p.Page_you_recently_liked);

		System.out.println("------------------------");
	}

}
