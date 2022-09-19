
class SuperKey {

	int age;

	/*
	 * SuperKey() { System.out.println("Parent class Constructor"); }
	 */

	SuperKey(String name) {
		System.out.println("Name is" + name);
	}

	void m1() {
		System.out.println("This is method 1 in parent class");
	}

	void m2(int id) {
		System.out.println("Id is" + id);
	}
}

public class SuperKeyword extends SuperKey {

	SuperKeyword() {
		// super();
		super("Sai Vikas"); // Doubt
		System.out.println("Child class Construtor");
	}

	void m3() {
		System.out.println("This is method3");
		System.out.println("My age is" + super.age);
		super.m1();
		super.m2(22);
	}

	public static void main(String[] args) {
		SuperKeyword s = new SuperKeyword();
		s.m3();
	}

}

