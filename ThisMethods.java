class thisKey {
	int id;
	String name;
	String College;

	thisKey(int age) {
		System.out.println("Constructor" + age);
	}

	thisKey(int id, String name, String College) {
		this(11);
		this.id = id;
		this.name = name;
		this.College = College;
		System.out.println(" Constructors id =" + id + " Name = " + name + " College = " + College);

	}

	void hello() {
		System.out.println("Hii");
	}

	public void display(int id, String name, String College) {

		this.hello();
		System.out.println("Methods id =" + id + " Name = " + name + " College = " + College);

	}
}
public class ThisMethods {
	public static void main(String args[]) {
		thisKey t = new thisKey(55, "vikas", "NmR");
		t.display(75, "Sai", "Nmrec");
	}
}
